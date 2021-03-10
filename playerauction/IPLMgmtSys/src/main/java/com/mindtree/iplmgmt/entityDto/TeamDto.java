package com.mindtree.iplmgmt.entityDto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.iplmgmt.entity.Ground;
import com.mindtree.iplmgmt.entity.Player;
import com.mindtree.iplmgmt.entity.Team;

public class TeamDto {
	private int teamId;
	private String teamName;
	@JsonIgnoreProperties("groundTeam")
	private GroundDto teamGround;
	private String teamManager;
	private double teamBudget;
@JsonIgnoreProperties("playerTeam")
	private Set<PlayerDto> teamPlayers;
public int getTeamId() {
	return teamId;
}
public void setTeamId(int teamId) {
	this.teamId = teamId;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public GroundDto getTeamGround() {
	return teamGround;
}
public void setTeamGround(GroundDto teamGround) {
	this.teamGround = teamGround;
}
public String getTeamManager() {
	return teamManager;
}
public void setTeamManager(String teamManager) {
	this.teamManager = teamManager;
}
public double getTeamBudget() {
	return teamBudget;
}
public void setTeamBudget(double teamBudget) {
	this.teamBudget = teamBudget;
}
public Set<PlayerDto> getTeamPlayers() {
	return teamPlayers;
}
public void setTeamPlayers(Set<PlayerDto> teamPlayers) {
	this.teamPlayers = teamPlayers;
}

}
