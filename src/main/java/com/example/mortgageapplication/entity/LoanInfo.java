package com.example.mortgageapplication.entity;


import javax.persistence.*;

@Entity
@Table(name="loaninfo")
public class LoanInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;


    @Column
    @Access(AccessType.FIELD)
    private Integer cuatomerId;

    @Column
    @Access(AccessType.FIELD)
    private String name;

    @Column
    @Access(AccessType.FIELD)
    private String email;

    @Column
    @Access(AccessType.FIELD)
    private Double phoneNumber;

    @Column
    @Access(AccessType.FIELD)
    private Integer loanId;

    @Column
    @Access(AccessType.FIELD)
    private Double requestedAmount;

    @Column
    @Access(AccessType.FIELD)
    private Double approvedAmount;

    @Column
    @Access(AccessType.FIELD)
    private Double rateOfInterest;

    @Column
    @Access(AccessType.FIELD)
    private double emi;

    public Double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(Double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public Double getTenure() {
        return tenure;
    }

    public void setTenure(Double tenure) {
        this.tenure = tenure;
    }

    @Column
    @Access(AccessType.FIELD)
    private  Double tenure;



    public Integer getCuatomerId() {
        return cuatomerId;
    }

    public void setCuatomerId(Integer cuatomerId) {
        this.cuatomerId = cuatomerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Double getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(Double requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public Double getApprovedAmount() {
        return approvedAmount;
    }

    public void setApprovedAmount(Double approvedAmount) {
        this.approvedAmount = approvedAmount;
    }


    public Integer getId() {
        return Id;
    }
}