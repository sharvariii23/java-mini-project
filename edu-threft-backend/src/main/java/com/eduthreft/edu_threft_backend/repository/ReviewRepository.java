package com.eduthreft.edu_threft_backend.repository;

import com.eduthreft.edu_threft_backend.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
