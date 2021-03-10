package com.mindtree.iplmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.iplmgmt.entity.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
