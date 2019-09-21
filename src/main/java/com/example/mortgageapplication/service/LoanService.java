package com.example.mortgageapplication.service;

import com.example.mortgageapplication.pvo.LoanInfoPVO;
import com.example.mortgageapplication.pvo.UserPVO;

import java.util.List;

public interface LoanService {

    public LoanInfoPVO saveLoanInfo(Integer id, Double amount);
    public  List getLoanInfo();

}
