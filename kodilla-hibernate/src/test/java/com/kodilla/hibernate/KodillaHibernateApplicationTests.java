package com.kodilla.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

@RunWith(SpringRunner.class)
@SpringBootTest
public class KodillaHibernateApplicationTests {

    @Test
    public void contextLoads() {
    }

}
