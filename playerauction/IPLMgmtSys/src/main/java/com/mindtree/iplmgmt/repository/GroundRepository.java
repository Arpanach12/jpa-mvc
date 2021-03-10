package com.mindtree.iplmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.iplmgmt.entity.Ground;
@Repository
public interface GroundRepository extends JpaRepository<Ground, Integer> {

}
