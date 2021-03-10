package com.mindtree.iplmgmt.entityDto;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.iplmgmt.entity.Team;

public class PlayerDto {
	private int playerId;
	private String playerName;
	private double playerBasePrice;
	@JsonIgnoreProperties("teamPlayers")
	private TeamDto playerTeam;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public double getPlayerBasePrice() {
		return playerBasePrice;
	}
	public void setPlayerBasePrice(double playerBasePrice) {
		this.playerBasePrice = playerBasePrice;
	}
	public TeamDto getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(TeamDto playerTeam) {
		this.playerTeam = playerTeam;
	}
	
}
