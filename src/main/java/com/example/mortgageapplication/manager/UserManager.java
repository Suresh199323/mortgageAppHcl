    package com.example.mortgageapplication.manager;

    import com.example.mortgageapplication.entity.User;
    import com.example.mortgageapplication.entity.UserLoan;
    import com.example.mortgageapplication.pvo.UserPVO;
    import com.example.mortgageapplication.repository.AmountRepository;
    import com.example.mortgageapplication.repository.UserRepository;
    import com.example.mortgageapplication.service.UserService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import javax.transaction.Transactional;
    import java.util.List;

    @Service
    @Transactional
    public class UserManager implements UserService {
        @Autowired
        UserRepository userRepository;
        @Autowired
        private AmountRepository amountRepository;

        /*public UserManager(UserRepository userRepository, AmountRepository amountRepository) {
            this.userRepository = userRepository;
            this.amountRepository=amountRepository;
        }*/


        @Override
        public User create(final User user) {
           // validate(user);
         List user1=  userRepository.findAll();
          if(user1.get()==user.getEmail())
          {
              throw new RuntimeException("User already exist");
          }
          userRepository.saveAndFlush(user);

            return user;
        }

        @Override
        public List<UserLoan> checkEligibility(Double propertyValue) {

            return amountRepository.findByLoanAmountLessThanEqual(propertyValue);
        }



        public void validate(final User user) {
            if (user == null) {


                throw new RuntimeException("NULL user cannot be saved");
            }
        }
    }

