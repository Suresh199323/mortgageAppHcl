    package com.example.mortgageapplication.manager;


    import com.example.mortgageapplication.entity.LoanInfo;
    import com.example.mortgageapplication.entity.User;
    import com.example.mortgageapplication.pvo.LoanInfoPVO;
    import com.example.mortgageapplication.repository.AmountRepository;
    import com.example.mortgageapplication.repository.LoanRepository;
    import com.example.mortgageapplication.repository.UserRepository;
    import com.example.mortgageapplication.service.LoanService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import javax.transaction.Transactional;
    import java.util.ArrayList;
    import java.util.List;

    @Service
    @Transactional
    public class LoanManager implements LoanService {

       static final LoanInfoPVO loanInfoPVO =new LoanInfoPVO();

       LoanInfo loanInfo1 =new LoanInfo();
    @Autowired
        UserRepository userRepository;

    @Autowired
    AmountRepository amountRepository;
        private LoanRepository loanRepository;
        public LoanManager(LoanRepository loanRepository) {
            this.loanRepository=loanRepository;
        }

        @Override
        public LoanInfoPVO saveLoanInfo(final Integer loanId, Double amount) {
            Double rateOfInterest=10d;
            Double tenure=20d;
            rateOfInterest=rateOfInterest/(12*100);
            tenure=tenure*12;
            double emi= (amount*rateOfInterest*Math.pow(1+rateOfInterest,tenure))/(Math.pow(1+rateOfInterest,tenure)-1);
            List<User> user1=  userRepository.findAll();
           final  Double approvedAmount=(double)((amount*80)/100);

    for(User user : user1) {
        loanInfoPVO.setCustomerId(user.getCustomerId());
        loanInfoPVO.setName(user.getFirstName() + " " + user.getLastName());
        loanInfoPVO.setEmail(user.getEmail());
        loanInfoPVO.setPhoneNumber(user.getPhoneNumber());
        loanInfoPVO.setLoanId(loanId);
        loanInfoPVO.setRequestedAmount(amount);
        loanInfoPVO.setApprovedAmount(approvedAmount);
        loanInfoPVO.setRateOfInterest(rateOfInterest);
        loanInfoPVO.setEmi(emi);
        loanInfoPVO.setTenure(tenure);
    }

    loanInfo1.setCuatomerId(loanInfoPVO.getCustomerId());
    loanInfo1.setName(loanInfoPVO.getName());
    loanInfo1.setEmail(loanInfoPVO.getEmail());
    loanInfo1.setPhoneNumber(loanInfoPVO.getPhoneNumber());
    loanInfo1.setLoanId(loanInfoPVO.getLoanId());
    loanInfo1.setRequestedAmount(loanInfoPVO.getRequestedAmount());
    loanInfo1.setApprovedAmount(loanInfoPVO.getApprovedAmount()) ;
    loanInfo1.setRateOfInterest(loanInfoPVO.getRateOfInterest());
    loanInfo1.setEmi(loanInfoPVO.getEmi());
    loanInfo1.setTenure(loanInfoPVO.getTenure());

            loanRepository.saveAndFlush(loanInfo1);


    return loanInfoPVO;
        }

        public  List getLoanInfo(){
            List<Double> arrayList=new ArrayList<>();
            arrayList.add(loanInfoPVO.getApprovedAmount());
            arrayList.add(loanInfoPVO.getTenure());
            arrayList.add(loanInfoPVO.getRateOfInterest());
            return arrayList;
        }


       }
