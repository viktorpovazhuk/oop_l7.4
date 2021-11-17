package sender;

import user.User;

import java.util.Date;

public class MessageSender {
    public static boolean send(String text, User user, String country) {
        Date lastActiveTime = user.getLastTime();
        Date currentTime = new Date();
        if (lastActiveTime.getTime() - currentTime.getTime() < 2*60*60*1000 && user.getCountry().equals(country)) {
            // send text to email
            return true;
        }
        return false;
    }
}
