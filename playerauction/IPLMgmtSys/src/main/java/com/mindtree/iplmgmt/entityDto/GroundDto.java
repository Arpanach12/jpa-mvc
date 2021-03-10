package com.mindtree.iplmgmt.entityDto;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.iplmgmt.entity.Location;
import com.mindtree.iplmgmt.entity.Team;

public class GroundDto {
	private int groundId;
	private String groundName;
	@JsonIgnoreProperties("teamGround")
	private TeamDto groundTeam;
	@JsonIgnoreProperties("locationGround")
	private LocationDto groundLocation;
	public int getGroundId() {
		return groundId;
	}
	public void setGroundId(int groundId) {
		this.groundId = groundId;
	}
	public String getGroundName() {
		return groundName;
	}
	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}
	public TeamDto getGroundTeam() {
		return groundTeam;
	}
	public void setGroundTeam(TeamDto groundTeam) {
		this.groundTeam = groundTeam;
	}
	public LocationDto getGroundLocation() {
		return groundLocation;
	}
	public void setGroundLocation(LocationDto groundLocation) {
		this.groundLocation = groundLocation;
	}
	
}
