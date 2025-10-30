package com.eduthreft.edu_threft_backend.repository;

import com.eduthreft.edu_threft_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
