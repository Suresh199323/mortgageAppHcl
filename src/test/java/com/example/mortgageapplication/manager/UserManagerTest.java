package com.example.mortgageapplication.manager;
import com.example.mortgageapplication.entity.User;
import com.example.mortgageapplication.entity.UserLoan;
import com.example.mortgageapplication.pvo.UserPVO;
import com.example.mortgageapplication.repository.AmountRepository;
import com.example.mortgageapplication.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class UserManagerTest

{
    @Mock
    UserRepository userRepository;

    @Mock
    AmountRepository amountRepository;

    @InjectMocks
    UserManager  userManager;
    Date dateObject=null;
    @Test
    public void create() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "1993-02-11";

        try {
            dateObject  = sdf.parse(dateString);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        User user=new User();
        user.setFirstName("suresh");
        user.setLastName("chand");
        user.setDateOfBirth(dateObject);
        user.setGender("male");
        user.setPhoneNumber(9999d);
        user.setEmail("schand@gmail.com");
        user.setPropertyType("home");
        user.setPropertyValue(500000d);
        user.setAddress("bang");

       Optional<User> users = Optional.of(user);

        Mockito.when(userRepository.saveAndFlush(user)).thenReturn(user);

        User user1 = userManager.create(user);

        Assert.assertNotNull(user1);
       // Assert.assertNotNull( userManager.validate(user1));
        Assert.assertEquals("suresh", user1.getFirstName());

    }

    /*public UserLoan()
    {}*/
    @Test
    public void checkEligibility() {

        Double propertyValue =600000d;
        List<Double> userLoans=new ArrayList<>();
        userLoans.add(200000d);
        userLoans.add(300000d);

        //List<UserLoan>
        UserLoan userLoan=new UserLoan();
        userLoan.setLoanAmount(200000d);
        userLoan.setLoanAmount(300000d);
        userLoan.setLoanAmount(400000d);
        userLoan.setLoanAmount(500000d);
        userLoan.setLoanAmount(600000d);
        userLoan.setLoanAmount(700000d);

        UserPVO userPVO=new UserPVO();
        userPVO.setFirstName("suresh");
        userPVO.setLastName("chand");
        userPVO.setDateOfBirth(dateObject);
        userPVO.setGender("male");
        userPVO.setPhoneNumber(9999d);
        userPVO.setEmail("schand@gmail.com");
        userPVO.setPropertyType("home");
        userPVO.setPropertyValue(500000d);
        userPVO.setAddress("bang");

        Optional<UserLoan> users = Optional.of(userLoan);
        Boolean b=true;
        Mockito.lenient().when(amountRepository.findByLoanAmountLessThanEqual(propertyValue)).thenReturn(new ArrayList<UserLoan>());

        List<UserLoan> userLoan1 = userManager.checkEligibility(600000d);
        Assert.assertNotNull(userLoan1);

        Assert.assertNotNull(userPVO);
        Assert.assertEquals("suresh", userPVO.getFirstName());
    }
}
