package user;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User{
    private final FacebookUser service;

    public MyFacebookUser(FacebookUser service) {
        this.service = service;
    }

    @Override
    public String getEmail() {
        return service.getEmail();
    }

    @Override
    public String getCountry() {
        return service.getUserCountry();
    }

    @Override
    public Date getLastTime() {
        return service.getUserActiveTime();
    }
}
