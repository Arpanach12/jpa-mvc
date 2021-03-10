package dao;

import java.util.List;

import entity.Hotel;
import entity.Room;

public interface DaoHotel {

	String addRoomToHotel(List<Hotel> hotelList);

	List<Room> getAllRoomUnbookedRoom(int hotelid);

	String bookAHotel(int hotelid);

}
