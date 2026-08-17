package com.spring.ioc;

public class UserDetails {
    private UserDataProvider userDataProvider;

    public UserDetails(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public void displayUserDetails(){
        System.out.println(userDataProvider.toString());
        System.out.println(userDataProvider.getUserDetails());
    }
}
