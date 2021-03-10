package com.mindtree.iplmgmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.iplmgmt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByuserEmail(String Email);
	Optional<User> findByuserpassword(String password);
}
