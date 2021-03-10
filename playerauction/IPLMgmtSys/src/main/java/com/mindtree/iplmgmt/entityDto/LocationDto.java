package com.mindtree.iplmgmt.entityDto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class LocationDto {

	private int locationId;
	private String locationName;
	@JsonIgnoreProperties("groundLocation")
	private Set<GroundDto> locationGround;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public Set<GroundDto> getLocationGround() {
		return locationGround;
	}
	public void setLocationGround(Set<GroundDto> locationGround) {
		this.locationGround = locationGround;
	}
	
}
