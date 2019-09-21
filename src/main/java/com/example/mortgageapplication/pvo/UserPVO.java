package com.example.mortgageapplication.pvo;

import java.util.Date;

public class UserPVO {

    //private Integer customerId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private Double accoountNumber;

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

    private Integer age;
    private Double phoneNumber;
    private String email;
    private String propertyType;
   private Double propertyValue;
   private String address;

   /* public Integer getCustomerId() {
        return customerId;
    }
*/
  /*  public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }*/

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
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






