package client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Hotel;
import entity.Room;
import service.HotelService;
import service.serviceimpl.HotelServiceImpl;

public class HotelApp 
{
	public static void main(String[] args) {
	HotelService hotelservice=new HotelServiceImpl();
	Scanner sc=new Scanner(System.in);
	int count = 0;
	
	do {
		displayMenus();

		int option = sc.nextInt();
		switch (option) {
		case 1:
			addAHotelWithRoom(sc,hotelservice);

			break;
		case 2:
			showRooms(sc,hotelservice);

			break;
		case 3:
			bookARoom(sc,hotelservice);
			break;
		case 4:
			System.exit(0);
			break;

		default:
			count = 1;
		}
	} while (count == 0);

	}
	private static void bookARoom(Scanner sc, HotelService hotelservice) {
System.out.println("enter the hotel id in whic you want to booked");
int hotelid=sc.nextInt();
String s=hotelservice.setTheBookingRoom(hotelid);
	}
	private static void showRooms(Scanner sc, HotelService hotelservice) {
		System.out.println("enter the hotelid for which rooms to be checked");
		int hotelid=sc.nextInt();
		List<Room> rooms=hotelservice.getAllUnbookedRoom(hotelid);
		rooms.forEach(r->System.out.println(r));
	}
	private static void addAHotelWithRoom(Scanner sc, HotelService hotelservice) {
		List<Hotel> hotelList=new ArrayList<>();
		List<Room> roomList=new ArrayList<>();
		System.out.println("enter the hotel id");
        int hotelId=sc.nextInt();
		System.out.println("enter the hotel name");
		String hotelName=sc.next();
		System.out.println("enter the hotel location");
		String hotelLoc=sc.next();
		System.out.println("enter the number of room to assign");
		int roomCount=sc.nextInt();
		for(int i=0;i<roomCount;i++)
		{
			System.out.println("enter the room id");
	        int roomId=sc.nextInt();
			System.out.println("enter the room name");
			String roomName=sc.next();
			System.out.println("enter the cost of room");
			int roomcost =sc.nextInt();
			System.out.println("enter the room status");
			boolean isBooked=sc.nextBoolean();
			
			roomList.add(new Room(roomId,roomName,roomcost,isBooked,hotelId));
		}
		hotelList.add(new Hotel(hotelId,hotelName,hotelLoc,roomList));
		String s=hotelservice.assignHotelToRooms(hotelList);
		System.out.println(s);
		
	}
	private static void displayMenus() {
		System.out.println("enter 1 -> add a room");
		System.out.println("enter 2 -> show unbooked room under a hotel ");
		System.out.println("enter 3 -> book a room under a particular hotel ");

	}
	
}


