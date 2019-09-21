package com.example.mortgageapplication.repository;

import com.example.mortgageapplication.entity.LoanInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository  extends JpaRepository<LoanInfo, Long> {
List<LoanInfo> findByEmailAndPhoneNumber(String email, Double phoneNumer);

   }
