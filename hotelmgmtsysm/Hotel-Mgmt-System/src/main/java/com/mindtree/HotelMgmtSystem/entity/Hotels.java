package com.mindtree.HotelMgmtSystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hotels {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int hotelId;
private String hotelName;
@OneToMany(cascade=CascadeType.ALL, mappedBy="userHotel")
private List<Users> hotelUsers;
@OneToMany(cascade=CascadeType.ALL, mappedBy="hotel")
private List<Rooms> hotelRooms;
private int hotelPrice;
public Hotels() {}
public Hotels(int hotelId, String hotelName, List<Users> hotelUsers, List<Rooms> hotelRooms, int hotelPrice) {
	super();
	this.hotelId = hotelId;
	this.hotelName = hotelName;
	this.hotelUsers = hotelUsers;
	this.hotelRooms = hotelRooms;
	this.hotelPrice = hotelPrice;
}
public int getHotelId() {
	return hotelId;
}
public void setHotelId(int hotelId) {
	this.hotelId = hotelId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public List<Users> getHotelUsers() {
	return hotelUsers;
}
public void setHotelUsers(List<Users> hotelUsers) {
	this.hotelUsers = hotelUsers;
}
public List<Rooms> getHotelRooms() {
	return hotelRooms;
}
public void setHotelRooms(List<Rooms> hotelRooms) {
	this.hotelRooms = hotelRooms;
}
public int getHotelPrice() {
	return hotelPrice;
}
public void setHotelPrice(int hotelPrice) {
	this.hotelPrice = hotelPrice;
}

}
