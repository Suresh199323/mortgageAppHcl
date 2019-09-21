package com.example.mortgageapplication.controller;

import com.example.mortgageapplication.entity.LoanInfo;
import com.example.mortgageapplication.entity.User;
import com.example.mortgageapplication.entity.UserLoan;
import com.example.mortgageapplication.pvo.UserPVO;
import com.example.mortgageapplication.repository.LoanRepository;
import com.example.mortgageapplication.repository.UserRepository;
import com.example.mortgageapplication.service.LoanService;
import com.example.mortgageapplication.service.UserService;
import com.example.mortgageapplication.util.PVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/mortgage")
    public class UserController {
        private UserService userService;

        @Autowired
        LoanService loanService;

        @Autowired
        UserRepository userRepository;

        @Autowired
        LoanRepository loanRepository;

        public UserController(UserService userService) {
            this.userService = userService;
        }

        @ResponseBody
        @PostMapping(value = "/apply")
        //@Consumes(Appliction/json)
        public ResponseEntity<List<UserLoan>> save(@RequestBody UserPVO userPVO) {
            User newUser = PVOUtil.createNew(userPVO);
            userService.create(newUser);
            Double propertyValue=userPVO.getPropertyValue();
            List<UserLoan> user = userService.checkEligibility(propertyValue);

            return new ResponseEntity<List<UserLoan>>(user, HttpStatus.OK);
        }


        @GetMapping("/find")
        public ResponseEntity<List>findLoanAmount(@RequestParam Integer id, @RequestParam Double amount) {
            loanService.saveLoanInfo(id, amount);
            return new ResponseEntity<List>(loanService.getLoanInfo(), HttpStatus.OK);
    }

        @GetMapping(value = "/getAll")
        public ResponseEntity<List<LoanInfo>> search(@RequestParam String email, @RequestParam Double phoneNumber) {
            List<LoanInfo>loanInfo= loanRepository.findByEmailAndPhoneNumber(email,phoneNumber);
            return new ResponseEntity<List<LoanInfo>>(loanInfo, HttpStatus.OK);
        }
}

