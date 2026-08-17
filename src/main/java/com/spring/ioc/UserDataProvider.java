package com.spring.ioc;

public class UserDataProvider implements DataProvider {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    @Override
    public String getUserDetails() {
        return "I'm the user in the UserDataProvider";
    }


    @Override
    public String toString() {
        return "UserDataProvider{" +
                "user='" + user + '\'' +
                '}';
    }

}
