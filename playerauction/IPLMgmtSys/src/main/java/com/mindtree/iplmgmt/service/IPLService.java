package com.mindtree.iplmgmt.service;

import java.util.List;
import java.util.Set;

import com.mindtree.iplmgmt.entity.Ground;
import com.mindtree.iplmgmt.entity.Location;
import com.mindtree.iplmgmt.entity.Player;
import com.mindtree.iplmgmt.entity.Team;
import com.mindtree.iplmgmt.entity.User;
import com.mindtree.iplmgmt.entityDto.GroundDto;
import com.mindtree.iplmgmt.exception.IPLException;

public interface IPLService {

	boolean getLoginValidateded(String userEmail, String userpassword) throws IPLException;

	List<Location> getAllLocations();

	void addAGroundForLocations(Ground ground);

	void addAPlayer(Player player);

	void addATeam(Team team);

	void addAUser(User user);

	List<Team> getAllTheTeams();

	List<Player> getAllPlayer();

	void setAPlayersWithTeam(int teamId, List<Integer> playerids) throws IPLException;

	Set<Ground> getAllGroundsforLocation(int locid);

	List<Team> getAllTeamNotAssigned();

	void setTeamForTheGround(int groundid, int teamid);

	Set<Player> getAllTheplayer(int teamId);

	void exportThedata() throws ClassNotFoundException;

	Set<GroundDto> getAllGroundsforLocationforDto(int id);

	double getThePlayerPrice(int playerid);

	void updateTheBasePriceTeam( double updatedprice, int playerid) throws IPLException;

}
