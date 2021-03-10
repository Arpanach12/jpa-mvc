package com.mindtree.codingChallenge2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.codingChallenge2.entity.Brand;
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
