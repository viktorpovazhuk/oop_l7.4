package sender;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import user.MyFacebookUser;
import user.User;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    private User user;

    @BeforeEach
    void setUp() {
        FacebookUser fb = new FacebookUser("@gmail.com", "UA", new Date());
        user = new MyFacebookUser(fb);
    }

    @Test
    void send() {
        assertTrue(MessageSender.send("mess", user, "UA"));
    }
}