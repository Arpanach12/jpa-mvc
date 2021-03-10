package com.mindtree.HotelMgmtSystem.entitydto;

import com.mindtree.HotelMgmtSystem.entity.Hotels;
import com.mindtree.HotelMgmtSystem.entity.Users;

public class RoomsDto {
	private int roomId;
	private String roomName;
	private UsersDto user;
	private HotelDto hotel;
	public RoomsDto() {}
	public RoomsDto(int roomId, String roomName, UsersDto user, HotelDto hotel) {
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
	public UsersDto getUser() {
		return user;
	}
	public void setUser(UsersDto user) {
		this.user = user;
	}
	public HotelDto getHotel() {
		return hotel;
	}
	public void setHotel(HotelDto hotel) {
		this.hotel = hotel;
	}
	
}
