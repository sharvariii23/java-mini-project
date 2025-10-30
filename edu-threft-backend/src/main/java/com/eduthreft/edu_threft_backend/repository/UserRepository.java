package com.eduthreft.edu_threft_backend.repository;

import com.eduthreft.edu_threft_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
