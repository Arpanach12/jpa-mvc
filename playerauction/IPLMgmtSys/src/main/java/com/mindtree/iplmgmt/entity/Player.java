package com.mindtree.iplmgmt.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Player implements Comparable<Player>,Serializable
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int playerId;
	private String playerName;
	private double playerBasePrice;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Team playerTeam;
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
	public Team getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(Team playerTeam) {
		this.playerTeam = playerTeam;
	}
	@Override
	public int compareTo(Player p) {
		return this.playerName.compareTo(p.playerName) ;
		//return (int) (p.playerBasePrice-this.playerBasePrice);
	}
//	@Override
//	public String toString() {
//		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerBasePrice=" + playerBasePrice
//				+ ", playerTeam=" + playerTeam + "]";
//	}
	

}
