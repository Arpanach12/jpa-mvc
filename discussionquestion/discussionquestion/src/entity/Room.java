package entity;

public class Room {
private int roomId;
private String roomName;
private int roomCost;
private boolean isBooked;
private int hotelId;
public Room () {}


public Room(int roomId, String roomName, int roomCost, boolean isBooked, int hotelId) {
	super();
	this.roomId = roomId;
	this.roomName = roomName;
	this.roomCost = roomCost;
	this.isBooked = isBooked;
	this.hotelId = hotelId;
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
public int getRoomCost() {
	return roomCost;
}
public void setRoomCost(int roomCost) {
	this.roomCost = roomCost;
}
public boolean isBooked() {
	return isBooked;
}
public void setBooked(boolean isBooked) {
	this.isBooked = isBooked;
}
public int getHotelId() {
	return hotelId;
}
public void setHotelId(int hotelId) {
	this.hotelId = hotelId;
}


@Override
public String toString() {
	return "Room [roomId=" + roomId + ", roomName=" + roomName + ", roomCost=" + roomCost + ", isBooked=" + isBooked
			+ ", hotelId=" + hotelId + "]";
}


}
