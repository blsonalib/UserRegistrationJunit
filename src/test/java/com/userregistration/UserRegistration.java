package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validFirstName(String firstName) {
            Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
            Matcher matcher=pattern.matcher(firstName);
            if(matcher.matches())
            {
                return true;
            }
            else
            {
                return false;
            }

    }

    public boolean validLastName(String lastName) {
        Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher=pattern.matcher(lastName);
        if(matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
