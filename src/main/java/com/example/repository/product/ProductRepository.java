package com.example.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
