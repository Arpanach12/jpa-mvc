package com.mindtree.HotelMgmtSystem.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.HotelMgmtSystem.entity.Hotels;
import com.mindtree.HotelMgmtSystem.entity.Users;
import com.mindtree.HotelMgmtSystem.repository.HotelsRepository;
import com.mindtree.HotelMgmtSystem.repository.UsersRepository;
import com.mindtree.HotelMgmtSystem.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {
@Autowired UsersRepository userRepository;
@Autowired HotelsRepository hotelRepository;
	@Override
	public String addAUser(Users user,int hotelId) {
		Hotels hotel=hotelRepository.findById(hotelId).get();
		user.setUserHotel(hotel);
		userRepository.save(user);
		return "inserted user";
	}

}
