package com.mindtree.iplmgmt.service.serviceimpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mindtree.iplmgmt.entity.Ground;
import com.mindtree.iplmgmt.entity.Location;
import com.mindtree.iplmgmt.entity.Player;
import com.mindtree.iplmgmt.entity.Team;
import com.mindtree.iplmgmt.entity.User;
import com.mindtree.iplmgmt.entityDto.GroundDto;
import com.mindtree.iplmgmt.exception.IPLException;
import com.mindtree.iplmgmt.repository.GroundRepository;
import com.mindtree.iplmgmt.repository.LocationRepository;
import com.mindtree.iplmgmt.repository.PlayerRepository;
import com.mindtree.iplmgmt.repository.TeamRepository;
import com.mindtree.iplmgmt.repository.UserRepository;
import com.mindtree.iplmgmt.service.IPLService;
@Service
public class IPLServiceImpl implements IPLService {
@Autowired
UserRepository userRepo;
@Autowired
LocationRepository locRepo;
@Autowired
PlayerRepository playerRepo;
@Autowired 
GroundRepository groundRepo;
@Autowired 
TeamRepository teamrepo;
ModelMapper mapper=new ModelMapper();
	@Override
	public boolean getLoginValidateded(String userEmail, String userpassword) throws IPLException {
	
		if(!userRepo.findByuserEmail(userEmail).isPresent())
		{
			throw new IPLException("no such user email exist");
		}
		if(!userRepo.findByuserpassword(userpassword).isPresent())
		{
			throw new IPLException("no such user password exist");
		}
		return true;
	}
	@Override
	public List<Location> getAllLocations() {
		return locRepo.findAll();
	}
	@Override
	public void addAGroundForLocations(Ground ground) {
		groundRepo.save(ground);
	}
	@Override
	public void addAPlayer(Player player) {
		playerRepo.save(player);
	}
	@Override
	public void addATeam(Team team) {
		teamrepo.save(team);
	}
	@Override
	public void addAUser(User user) {
userRepo.save(user);		
	}
	@Override
	public List<Team> getAllTheTeams() {
		return teamrepo.findAll();
	}
	@Override
	public List<Player> getAllPlayer() {
		return playerRepo.findAll().stream().filter(p->p.getPlayerTeam()==null).collect(Collectors.toList());
		
	}
	@Override
	public void setAPlayersWithTeam(int teamId, List<Integer> playerids) throws IPLException {
		
		Team team=teamrepo.findById(teamId).get();
		//List<Player> playerList=new ArrayList<Player>();
		Set<Player> playerSets=new HashSet<Player>();
		int TotalPrice=0;
		for(Integer integer:playerids)
		{
			Player player=playerRepo.findById(integer).get();
			TotalPrice+=player.getPlayerBasePrice();
			playerSets.add(player);
			
			
		}
		double teamCurrentBudget=team.getTeamBudget();
		if(TotalPrice>teamCurrentBudget)
		{
			throw new IPLException("No Budget For These Many player choose less player");
		}
		else
		{
			teamCurrentBudget-=TotalPrice;
			team.setTeamBudget(teamCurrentBudget);
		}
		if(team.getTeamPlayers()==null)
		{
			team.setTeamPlayers(playerSets);
			for(Player player:playerSets)
			{
				
				player.setPlayerTeam(team);
			}
			
		}
		else
		{
			for(Player player:playerSets)
			{
				team.getTeamPlayers().add(player);
				player.setPlayerTeam(team);
			}
		}
		teamrepo.saveAndFlush(team);
	}
	@Override
	public Set<Ground> getAllGroundsforLocation(int locid) {
		
		
		return locRepo.findById(locid).get().getLocationGround();
	}
	@Override
	public List<Team> getAllTeamNotAssigned() {
		return teamrepo.findAll().stream().filter(t->t.getTeamGround()==null).collect(Collectors.toList());
	}
	@Override
	public void setTeamForTheGround(int groundid, int teamid) {
		
		Ground ground=groundRepo.findById(groundid).get();
		Team team=teamrepo.findById(teamid).get();
		ground.setGroundTeam(team);
		groundRepo.saveAndFlush(ground);
	}
	@Override
	public Set<Player> getAllTheplayer(int teamId) {
	List<Player> listPlayer=new ArrayList<Player>(teamrepo.findById(teamId).get().getTeamPlayers());
	Collections.sort(listPlayer);
	Set<Player> modify=new HashSet<Player>(listPlayer);
		return modify;
	}
	@Override
	public void exportThedata() throws ClassNotFoundException {
List<Team> listTeam=teamrepo.findAll();

try {
	FileOutputStream fileOut = new FileOutputStream("team.txt");
	ObjectOutputStream out = new ObjectOutputStream(fileOut);
	out.writeObject(listTeam);
	out.close();
	fileOut.close();
	System.out.println("\nSerialization Successful... Checkout your specified output file..\n");

} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}

try {
	FileInputStream fileIn = new FileInputStream("team.txt");
	ObjectInputStream in = new ObjectInputStream(fileIn);
	System.out.println("Deserialized Data: \n" + in.readObject().toString());
	in.close();
	fileIn.close();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}

	}
	@Override
	public Set<GroundDto> getAllGroundsforLocationforDto(int id) {
		//return locRepo.findById(id).get().getLocationGround();
		return	locRepo.findById(id).get().getLocationGround().stream().map(entity->convertentityToDto(entity)).
		collect(Collectors.toSet());
		 
	}
	public GroundDto convertentityToDto(Ground ground)
	{
		return mapper.map(ground, GroundDto.class);
	}
	@Override
	public double getThePlayerPrice(int playerid) {
		
		
		return playerRepo.findById(playerid).get().getPlayerBasePrice();
	}
	@Override
	public void updateTheBasePriceTeam( double updatedprice, int playerid) throws IPLException {
		
		Optional<Player> opplayer=playerRepo.findById(playerid);
		Player player=opplayer.get();
		if(player.getPlayerTeam().getTeamBudget()<updatedprice)
		{
			throw new IPLException("budget cant be updated enter the less price please");
		}
		else
		{ 
			double updatedpriceforteam=0;
			player.setPlayerBasePrice(updatedprice);
			if(updatedprice>player.getPlayerBasePrice())
			{
			 updatedpriceforteam=player.getPlayerTeam().getTeamBudget()-updatedprice;
			}
			else
			{ double newprice=player.getPlayerBasePrice()-updatedprice;
				updatedpriceforteam=player.getPlayerTeam().getTeamBudget()+newprice;
			}
			player.getPlayerTeam().setTeamBudget(updatedpriceforteam);
			playerRepo.saveAndFlush(player);
			teamrepo.saveAndFlush(player.getPlayerTeam());
		}
	}
	
	
}
