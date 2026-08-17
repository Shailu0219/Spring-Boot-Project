package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDataManager {
    public static void main(String[] args) {
        
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationSpringIoc.xml");

        UserDetails userDetails =(UserDetails) applicationContext.getBean("userDetails");

        userDetails.displayUserDetails();
    }
}
