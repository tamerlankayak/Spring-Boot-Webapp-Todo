package az.azin.springbootwebapptodo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("tamerlan");
        boolean isValidPassword = password.equalsIgnoreCase("1");
        return isValidUsername && isValidPassword;
    }
}
