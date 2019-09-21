package com.example.mortgageapplication.entity;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer customerId;


    @Column
    @Access(AccessType.FIELD)
    private String firstName;

    @Column
    @Access(AccessType.FIELD)
    private Double accoountNumber;


    @Column
    @Access(AccessType.FIELD)
    private Integer age;


    public Double getAccoountNumber() {
        return accoountNumber;
    }

    public void setAccoountNumber(Double accoountNumber) {
        this.accoountNumber = accoountNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column
    @Access(AccessType.FIELD)
    private String lastName;

    @Column
    @Access(AccessType.FIELD)
    private Date dateOfBirth;



    @Column
    @Access(AccessType.FIELD)
    private String gender;
    @Column
    @Access(AccessType.FIELD)
    private Double phoneNumber;


    @Column
    @NaturalId
    @Access(AccessType.FIELD)
    private String email;

    @Column
    @Access(AccessType.FIELD)
    private String propertyType;

    @Column
    @Access(AccessType.FIELD)
    private Double propertyValue;


    @Column
    // @NaturalId
    @Access(AccessType.FIELD)
    private String address;

    public Double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getPropertyType() {
        return propertyType;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(Double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

