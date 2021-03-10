package service;

import java.util.List;

import entity.Hotel;
import entity.Room;

public interface HotelService {

String assignHotelToRooms(List<Hotel> hotelList);

List<Room> getAllUnbookedRoom(int hotelid);

String setTheBookingRoom(int hotelid);

}
