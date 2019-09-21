package com.example.mortgageapplication.manager;

import com.example.mortgageapplication.entity.LoanInfo;
import com.example.mortgageapplication.entity.User;
import com.example.mortgageapplication.entity.UserLoan;
import com.example.mortgageapplication.pvo.LoanInfoPVO;
import com.example.mortgageapplication.repository.LoanRepository;
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
public class LoanManagerTest {
    @Mock
    LoanRepository loanRepository;
    @Mock
    UserRepository userRepository;

    @InjectMocks
    LoanManager  loanManager;
    private Date dateObject=null;
   private Double approvedAmount=null;
    Double rateOfInterest=null;
    Double amount=null;
    Double tenure=null;
    @Test
    public void testSaveLoanInfo()
    {
        amount=600000d;
        rateOfInterest=10d;
        tenure=20d;
        rateOfInterest=rateOfInterest/(12*100);
        tenure=tenure*12;
        double emi= (amount*rateOfInterest*Math.pow(1+rateOfInterest,tenure))/(Math.pow(1+rateOfInterest,tenure)-1);
        List<User> user1=  userRepository.findAll();
        approvedAmount=(double)((amount*80)/100);

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "1993-02-11";

        try {
            dateObject  = sdf.parse(dateString);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        LoanInfo loanInfo1=new LoanInfo();

        loanInfo1.setCuatomerId(1);
        loanInfo1.setName("suresh");
        loanInfo1.setEmail("schand@hcl.com");
        loanInfo1.setPhoneNumber(8888d);
        loanInfo1.setLoanId(4);
        loanInfo1.setRequestedAmount(amount);
        loanInfo1.setApprovedAmount(approvedAmount) ;
        loanInfo1.setRateOfInterest(rateOfInterest);
        loanInfo1.setEmi(emi);
        loanInfo1.setTenure(tenure);
        Optional<LoanInfo> users = Optional.of(loanInfo1);
        Mockito.lenient().when(loanRepository.saveAndFlush(loanInfo1)).thenReturn(loanInfo1);
        Assert.assertNotNull(loanInfo1);
        Assert.assertEquals("suresh", loanInfo1.getName());
    }


@Test
public void getLoanInfo(){
    List<Double> arrayList=new ArrayList<>();
    arrayList.add(approvedAmount);
    arrayList.add(tenure);
    arrayList.add(rateOfInterest);
    Optional<?> users = Optional.of(arrayList);
    Assert.assertNotNull(users);
}

}
