package com.example.mortgageapplication.entity;

import javax.persistence.*;

@Entity
@Table(name="userloan")
public class UserLoan //extends Perpetual
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer LoanId;

    public Integer getLoanId() {
        return LoanId;
    }

    public void setLoanId(Integer loanId) {
        LoanId = loanId;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Column
    @Access(AccessType.FIELD)
    private Double loanAmount;

}