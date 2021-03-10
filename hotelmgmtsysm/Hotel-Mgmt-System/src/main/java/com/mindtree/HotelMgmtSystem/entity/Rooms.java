package com.mindtree.HotelMgmtSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Rooms {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int roomId;
private String roomName;
@ManyToOne(cascade=CascadeType.PERSIST)
private Users user;
@ManyToOne(cascade=CascadeType.PERSIST)
private Hotels hotel;
public Rooms() {}
public Rooms(int roomId, String roomName, Users user, Hotels hotel) {
	super();
	this.roomId = roomId;
	this.roomName = roomName;
	this.user = user;
	this.hotel = hotel;
}
public int getRoomId() {
	return roomId;
}
public void setRoomId(int roomId) {
	this.roomId = roomId;
}
public String getRoomName() {
	return roomName;
}
public void setRoomName(String roomName) {
	this.roomName = roomName;
}
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}
public Hotels getHotel() {
	return hotel;
}
public void setHotel(Hotels hotel) {
	this.hotel = hotel;
}

}
