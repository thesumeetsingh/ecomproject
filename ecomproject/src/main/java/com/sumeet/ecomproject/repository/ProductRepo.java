package com.sumeet.ecomproject.repository;

import com.sumeet.ecomproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
