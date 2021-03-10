package com.mindtree.HotelMgmtSystem.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.HotelMgmtSystem.entity.Rooms;
import com.mindtree.HotelMgmtSystem.entitydto.RoomsDto;
import com.mindtree.HotelMgmtSystem.repository.RoomsRepository;
import com.mindtree.HotelMgmtSystem.service.RoomsService;
@Service
public class RoomsServiceImpl implements RoomsService {
@Autowired RoomsRepository roomRepository;
ModelMapper mapper=new ModelMapper();

	@Override
	public RoomsDto addRooms(RoomsDto roomdto) {
		Rooms roomEntity=convertToEntity(roomdto);
		roomRepository.save(roomEntity);
		
		return null;
	}
	private Rooms convertToEntity(RoomsDto roomdto) {
		
		return mapper.map(roomdto, Rooms.class);
	}
private RoomsDto convertToDto(Rooms room)
{
	return mapper.map(room, RoomsDto.class);
	
}
}
