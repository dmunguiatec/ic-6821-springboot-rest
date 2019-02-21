package edu.tec.ic6821.sample.services;

import edu.tec.ic6821.sample.daos.UserDao;
import edu.tec.ic6821.sample.services.impl.UserServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserServiceTests {

    @TestConfiguration
    static class UserServiceTestsConfiguration {
        @MockBean
        UserDao userDao;

        @Autowired
        PasswordEncoder passwordEncoder;

        @Bean
        public UserService userService() {
            return new UserServiceImpl(userDao, passwordEncoder);
        }
    }

    @Autowired
    UserService userService;

    @Autowired
    UserDao userDao;
}
