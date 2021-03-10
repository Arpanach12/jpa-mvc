package com.mindtree.iplmgmt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Location implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int locationId;
	private String locationName;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "groundLocation")
	private Set<Ground> locationGround;
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
	public Set<Ground> getLocationGround() {
		return locationGround;
	}
	public void setLocationGround(Set<Ground> locationGround) {
		this.locationGround = locationGround;
	}
//	@Override
//	public String toString() {
//		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", locationGround="
//				+ locationGround + "]";
//	}
//	

}
