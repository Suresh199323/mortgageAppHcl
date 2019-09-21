package com.example.mortgageapplication.util;
import com.example.mortgageapplication.entity.User;
import com.example.mortgageapplication.pvo.UserPVO;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PVOUtil {
    static User user = new User();
    private PVOUtil() {
    }

    public static final User createNew(UserPVO userPVO ){
        if (userPVO == null) {
            return null;
        }
        Random rand = new Random();
        Double rand_int1 = rand.nextDouble();

        user.setAccoountNumber(rand_int1);
        user.setFirstName(userPVO.getFirstName());
        user.setLastName(userPVO.getLastName());
        user.setDateOfBirth(userPVO.getDateOfBirth());
        user.setGender(userPVO.getGender());
        user.setPhoneNumber(userPVO.getPhoneNumber());
        user.setEmail(userPVO.getEmail());
        user.setPropertyType(userPVO.getPropertyType());
        user.setPropertyValue(userPVO.getPropertyValue());
        user.setAddress(userPVO.getAddress());
        return user;
    }


    public static Double getPhoneNumber() {
      return  user.getPhoneNumber();
    }

    public  static final List<Double> calculator(Double principalAmount) {
        if (principalAmount == null) {
            return null;
        }
       Double rateOfInterest=10d;
        Double tenure=20d;
        rateOfInterest=rateOfInterest/(12*100);
        tenure=tenure*12;
        double emi= (principalAmount*rateOfInterest*Math.pow(1+rateOfInterest,tenure))/(Math.pow(1+rateOfInterest,tenure)-1);
        ArrayList<Double> loanDetails=new ArrayList<>();
        loanDetails.add(rateOfInterest);
        loanDetails.add(tenure);
        loanDetails.add(emi);
        loanDetails.add(principalAmount);
        loanDetails.add(PVOUtil.getPhoneNumber());
        return loanDetails;
    }
}
