package com.mindtree.HotelMgmtSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int userId;
private String userName;
@OneToMany(cascade=CascadeType.ALL,mappedBy="user")
private List<Rooms> userRooms;
@ManyToOne(cascade=CascadeType.PERSIST)
private Hotels userHotel;
public Users() {}
public Users(int userId, String userString, List<Rooms> userRooms, Hotels userHotel) {
	super();
	this.userId = userId;
	this.userName = userString;
	this.userRooms = userRooms;
	this.userHotel = userHotel;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userString) {
	this.userName = userString;
}
public List<Rooms> getUserRooms() {
	return userRooms;
}
public void setUserRooms(List<Rooms> userRooms) {
	this.userRooms = userRooms;
}
public Hotels getUserHotel() {
	return userHotel;
}
public void setUserHotel(Hotels userHotel) {
	this.userHotel = userHotel;
}

}
