package com.mindtree.HotelMgmtSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.HotelMgmtSystem.entity.Hotels;

public interface HotelsRepository extends JpaRepository<Hotels, Integer> {

}
