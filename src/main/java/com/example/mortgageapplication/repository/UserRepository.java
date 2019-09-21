package com.example.mortgageapplication.repository;


import com.example.mortgageapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    List<User> findByEmailAndPhoneNumber(String email, Double phoneNumber);
    //User findByCustomerEmail(String email);
  // User findAll();
}

