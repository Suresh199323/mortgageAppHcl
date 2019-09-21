package com.example.mortgageapplication.repository;

import com.example.mortgageapplication.entity.UserLoan;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface AmountRepository  extends JpaRepository<UserLoan, Long> {
    List<UserLoan> findByLoanAmountLessThanEqual(Double loanamount);

}
