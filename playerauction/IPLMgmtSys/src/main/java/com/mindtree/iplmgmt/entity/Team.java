package com.mindtree.iplmgmt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Team implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamId;
	private String teamName;
	@OneToOne(cascade = CascadeType.PERSIST ,mappedBy = "groundTeam")
	private Ground teamGround;
	private String teamManager;
	private double teamBudget;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "playerTeam")
	private Set<Player> teamPlayers;
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
	public Ground getTeamGround() {
		return teamGround;
	}
	public void setTeamGround(Ground teamGround) {
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
	public Set<Player> getTeamPlayers() {
		return teamPlayers;
	}
	public void setTeamPlayers(Set<Player> teamPlayers) {
		this.teamPlayers = teamPlayers;
	}
//	@Override
//	public String toString() {
//		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamGround=" + teamGround + ", teamManager="
//				+ teamManager + ", teamBudget=" + teamBudget + ", teamPlayers=" + teamPlayers + "]";
//	}
//	
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamManager=" + teamManager + ", teamBudget="
				+ teamBudget + "]";
	}
	
	

}
