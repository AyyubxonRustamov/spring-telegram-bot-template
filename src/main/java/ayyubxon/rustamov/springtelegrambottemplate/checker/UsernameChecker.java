package ayyubxon.rustamov.springtelegrambottemplate.checker;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.User;

@Service
public class UsernameChecker {

    public String check(User user) {
        return "[" + user.getFirstName() + "](tg://user?id=" + user.getId() + ")";
    }

}
