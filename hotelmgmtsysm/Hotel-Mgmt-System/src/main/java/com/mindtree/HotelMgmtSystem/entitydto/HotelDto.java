package com.mindtree.HotelMgmtSystem.entitydto;

import java.util.List;

import com.mindtree.HotelMgmtSystem.entity.Rooms;
import com.mindtree.HotelMgmtSystem.entity.Users;

public class HotelDto {
	private int hotelId;
	private String hotelName;
	private List<UsersDto> hotelUsers;
	private List<RoomsDto> hotelRooms;
	private int hotelPrice;
	public HotelDto() {}
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
	public List<UsersDto> getHotelUsers() {
		return hotelUsers;
	}
	public void setHotelUsers(List<UsersDto> hotelUsers) {
		this.hotelUsers = hotelUsers;
	}
	public List<RoomsDto> getHotelRooms() {
		return hotelRooms;
	}
	public void setHotelRooms(List<RoomsDto> hotelRooms) {
		this.hotelRooms = hotelRooms;
	}
	public int getHotelPrice() {
		return hotelPrice;
	}
	public void setHotelPrice(int hotelPrice) {
		this.hotelPrice = hotelPrice;
	}
	
}
