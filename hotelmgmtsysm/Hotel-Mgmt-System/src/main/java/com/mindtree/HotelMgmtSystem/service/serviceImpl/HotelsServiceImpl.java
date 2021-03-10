package com.mindtree.HotelMgmtSystem.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.HotelMgmtSystem.entity.Hotels;
import com.mindtree.HotelMgmtSystem.repository.HotelsRepository;
import com.mindtree.HotelMgmtSystem.service.HotelsService;
@Service
public class HotelsServiceImpl implements HotelsService {
@Autowired HotelsRepository hotelRepository;
	@Override
	public String addAHotel(Hotels hotel) {
		hotelRepository.save(hotel);
		return "inserted hotel";
	}

}
