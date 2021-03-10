package service.serviceimpl;

import java.util.List;

import dao.DaoHotel;
import dao.daoimpl.DaoHotelImpl;
import entity.Hotel;
import entity.Room;
import service.HotelService;

public class HotelServiceImpl implements HotelService {
DaoHotel daohotel=new DaoHotelImpl();
	@Override
	public String assignHotelToRooms(List<Hotel> hotelList) {
		return daohotel.addRoomToHotel(hotelList);
		
		
	}
	@Override
	public List<Room> getAllUnbookedRoom(int hotelid) {
		
		return daohotel.getAllRoomUnbookedRoom(hotelid);
	
	}
	@Override
	public String setTheBookingRoom(int hotelid) {
	return daohotel.bookAHotel(hotelid);
	
	}

}
