package com.mindtree.HotelMgmtSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.HotelMgmtSystem.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
