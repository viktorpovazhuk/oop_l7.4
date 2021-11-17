package user;

import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser implements User{
    private TwitterUser service;

    @Override
    public String getEmail() {
        return service.getUserMail();
    }

    @Override
    public String getCountry() {
        return service.getCountry();
    }

    @Override
    public Date getLastTime() {
        return service.getLastActiveTime();
    }
}
