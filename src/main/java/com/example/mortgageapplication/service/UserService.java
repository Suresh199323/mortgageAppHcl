package com.example.mortgageapplication.service;

import com.example.mortgageapplication.entity.User;
import com.example.mortgageapplication.entity.UserLoan;
import com.example.mortgageapplication.pvo.UserPVO;



import java.util.List;

public interface UserService {

   //public User getAll(String email);
   User create(User user);
    List<UserLoan> checkEligibility(Double propertyValue);


}
