package com.mindtree.codingChallenge2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.codingChallenge2.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
