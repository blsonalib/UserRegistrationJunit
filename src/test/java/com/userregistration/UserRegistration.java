package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean validFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean validLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }

    }

    public Boolean validateEmailId(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]([._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2}){0,1}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validMobileNumber(String mobNumber) {
        Pattern pattern = Pattern.compile("^[0-9]{2,3}[: :][0-9]{10}$");
        Matcher matcher = pattern.matcher(mobNumber);
        if (matcher.matches()) {
            return true;
        }
        else
        {
            return false;
        }
    }
}