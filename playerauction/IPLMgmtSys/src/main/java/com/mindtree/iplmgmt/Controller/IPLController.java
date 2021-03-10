package com.mindtree.iplmgmt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.iplmgmt.entity.Ground;
import com.mindtree.iplmgmt.entity.Player;
import com.mindtree.iplmgmt.entity.Team;
import com.mindtree.iplmgmt.entity.User;
import com.mindtree.iplmgmt.exception.IPLException;
import com.mindtree.iplmgmt.service.IPLService;

@Controller
public class IPLController {
@Autowired
IPLService iplService;
int teamId2;
	@RequestMapping("/")
	public String index1() {
		return "home";
	}
	@RequestMapping("/login")
	public String index11() {
		return "login";
	}
	@RequestMapping("/registration")
	public String index13() {
		return "registration";
	}
	@RequestMapping("/addAuser")
	public String index131(User user) {
		iplService.addAUser(user);
		return "home";
	}
	@RequestMapping("/options")
	public String index1312() {
	
		return "options";
	}
	@RequestMapping("/addground")
	public String index14(Model model ,Ground ground) {
		if(ground.getGroundName()==null)
		{
			model.addAttribute("locations", iplService.getAllLocations());
			return "addground";
		}
		iplService.addAGroundForLocations(ground);
		model.addAttribute("locations", iplService.getAllLocations());
		return "addground";
	}
	
	@RequestMapping("/addplayer")
	public String index15(Player player) {
		if(player.getPlayerName()==null)
		{
			return "addplayer";
		}
		iplService.addAPlayer(player);
		return "addplayer";
	}
	@RequestMapping("/addteam")
	public String index16(Team team) {
		if(team.getTeamName()==null)
		{
			return "addteam";
		}
		else {
			iplService.addATeam(team);
			return "addteam";
		}
		
	}
	@RequestMapping("/assignPlayerToTeam")
	public String index17(Model model) {
		model.addAttribute("teams", iplService.getAllTheTeams());
		model.addAttribute("playerlist", iplService.getAllPlayer());
		return "assignPlayerToTeam";
	}
	@RequestMapping("/viewAll")
	public String index172(Model model) {
		model.addAttribute("teams", iplService.getAllTheTeams());
		return "viewAll";
	}
	@RequestMapping("/getPlayersByTeamId")
	public String index173(Model model,@RequestParam("teamid")  int teamId) {
		
		model.addAttribute("playerList", iplService.getAllTheplayer(teamId));
		model.addAttribute("teams", iplService.getAllTheTeams());
		teamId2=teamId;
		//iplService.getAllTheplayer(teamId).forEach(p->System.out.println(p));
		return "viewAll";
	}
	@RequestMapping("/assignTeamGround")
	public String index171(Model model) {
		//System.out.println("hello");
		 model.addAttribute("teams", iplService.getAllTheTeams()); 
		model.addAttribute("locations", iplService.getAllLocations());
		return "assignTeamGround";
	}
	

	
	@RequestMapping("/setTeamForTheGround")
	public String index172(Model model ,@RequestParam("groundId") int groundid,@RequestParam("teamId") int teamid) {
		iplService.setTeamForTheGround(groundid,teamid);
		return "options";
	}
	
	
	@RequestMapping("/setAPlayers")
	public String index17(Model model,@RequestParam("teamId") int teamId ,@RequestParam("playerId") List<Integer> playerids) throws IPLException {
 		iplService.setAPlayersWithTeam(teamId ,playerids);
		return "options";
	}
	@RequestMapping("/GotoOption")
	public String index12(@RequestParam("userEmail")String userEmail,@RequestParam("userpassword") String userpassword ) throws IPLException
	{
		
		boolean b=iplService.getLoginValidateded(userEmail,userpassword);
		if(!b)
		{
			return "error";
		}
		
		return "options";
	}
	
	@RequestMapping("/exportInFile")
	public String index171() throws IPLException, ClassNotFoundException {
 		iplService.exportThedata();
		return "options";
	}
	@RequestMapping("/updateTheplayerPrice/{playerid}")
	public String index173(@PathVariable("playerid") int playerid,Model model)  {
 	
 		model.addAttribute("previousprice", iplService.getThePlayerPrice(playerid));
 		model.addAttribute("playerid", playerid);
		return "update";
	}
	@RequestMapping("/update")
	public String index174(@RequestParam("updateprice")double updatedprice, 
			@RequestParam("playerid")int playerid ,Model model) throws IPLException  {
		iplService.updateTheBasePriceTeam(updatedprice,playerid);
		model.addAttribute("playerList", iplService.getAllTheplayer(teamId2));
		model.addAttribute("teams", iplService.getAllTheTeams());
		return "viewAll";
	}

}
