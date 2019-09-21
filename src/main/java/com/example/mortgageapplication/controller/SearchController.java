/*
package com.example.mortgageapplication.controller;

import com.example.mortgageapplication.entity.LoanInfo;
import com.example.mortgageapplication.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    LoanRepository loanRepository;
    @GetMapping(value = "/getAll")
    public ResponseEntity<List<LoanInfo>> search(@RequestParam Double phoneNumber) {
       List<LoanInfo>loanInfo= loanRepository.findByPhoneNumber(phoneNumber);
       return new ResponseEntity<List<LoanInfo>>(loanInfo, HttpStatus.OK);
      }
}
*/
