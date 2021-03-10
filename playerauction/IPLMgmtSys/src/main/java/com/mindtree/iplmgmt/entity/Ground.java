package com.mindtree.iplmgmt.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Ground implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int groundId;
private String groundName;
@OneToOne(cascade = CascadeType.PERSIST)
private Team groundTeam;
@ManyToOne(cascade = CascadeType.PERSIST)
private Location groundLocation;
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
public Team getGroundTeam() {
	return groundTeam;
}
public void setGroundTeam(Team groundTeam) {
	this.groundTeam = groundTeam;
}
public Location getGroundLocation() {
	return groundLocation;
}
public void setGroundLocation(Location groundLocation) {
	this.groundLocation = groundLocation;
}
//@Override
//public String toString() {
//	return "Ground [groundId=" + groundId + ", groundName=" + groundName + ", groundTeam=" + groundTeam
//			+ ", groundLocation=" + groundLocation + "]";
//}

}
