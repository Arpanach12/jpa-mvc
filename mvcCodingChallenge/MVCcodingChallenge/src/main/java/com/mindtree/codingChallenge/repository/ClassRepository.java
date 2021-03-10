package com.mindtree.codingChallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.codingChallenge.entity.Class;
@Repository
public interface ClassRepository extends JpaRepository<Class, Integer> {

}
