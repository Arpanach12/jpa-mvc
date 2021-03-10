package com.mindtree.iplmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.iplmgmt.entity.Location;
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
