package com.mindtree.HotelMgmtSystem.entitydto;

import java.util.List;

import com.mindtree.HotelMgmtSystem.entity.Hotels;
import com.mindtree.HotelMgmtSystem.entity.Rooms;

public class UsersDto {
	private int userId;
	private String userName;
	private List<RoomsDto> userRooms;
	private HotelDto userHotel;
	public UsersDto() {}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<RoomsDto> getUserRooms() {
		return userRooms;
	}
	public void setUserRooms(List<RoomsDto> userRooms) {
		this.userRooms = userRooms;
	}
	public HotelDto getUserHotel() {
		return userHotel;
	}
	public void setUserHotel(HotelDto userHotel) {
		this.userHotel = userHotel;
	}
	
}
