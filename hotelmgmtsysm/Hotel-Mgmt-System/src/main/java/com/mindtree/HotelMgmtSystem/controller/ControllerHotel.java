package com.mindtree.HotelMgmtSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.HotelMgmtSystem.entity.Hotels;
import com.mindtree.HotelMgmtSystem.entity.Rooms;
import com.mindtree.HotelMgmtSystem.entity.Users;
import com.mindtree.HotelMgmtSystem.entitydto.RoomsDto;
import com.mindtree.HotelMgmtSystem.service.HotelsService;
import com.mindtree.HotelMgmtSystem.service.RoomsService;
import com.mindtree.HotelMgmtSystem.service.UsersService;

@RestController
public class ControllerHotel {
	
@Autowired UsersService userService;
@Autowired HotelsService hotelService;
@Autowired RoomsService roomService;
@PostMapping("RegisterUser/user/{hotelid}")
public String RegisterUser(@RequestBody Users user,@PathVariable int hotelid)
{
	return userService.addAUser(user,hotelid);
}
@PostMapping("RegisterHotel/hotel")
public String Register(Hotels hotel)
{
	return hotelService.addAHotel(hotel);
}
@GetMapping("get")
public String abc()
{
	return "hello";
}

@PostMapping(value = "/room")


public RoomsDto addRoom(@RequestBody RoomsDto room) {


	return roomService.addRooms(room);


}

}
