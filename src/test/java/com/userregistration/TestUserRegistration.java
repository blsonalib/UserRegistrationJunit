package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {

    @Test
    public void toTest_FirstNameGivesAllAreValid_ReturnTestPass() {
        UserRegistration firstName = new UserRegistration();
        boolean fname = firstName.validFirstName("Akash");
        Assert.assertTrue(fname);
    }

    @Test
    public void toTest_FirstNameGivesFirstThreeLatter_ReturnTestPass() {
        UserRegistration firstName = new UserRegistration();
        boolean fname=firstName.validFirstName("Aka");
        Assert.assertTrue(fname);
    }
    @Test
    public void toTest_FirstNamGivesSmallLatters_ReturnTestFail(){
        UserRegistration firstName=new UserRegistration();
        boolean fname=firstName.validFirstName("akash");
        Assert.assertFalse(fname);
    }
    @Test
    public void toTest_FirstNameGivesTwoLatters_ReturnTestFail(){
        UserRegistration firstName=new UserRegistration();
        boolean fname=firstName.validFirstName("Ak");
        Assert.assertFalse(fname);
    }
    @Test
    public void toTest_FirstNameGivesNumericValue_ReturnTestFail(){
        UserRegistration firstName=new UserRegistration();
        boolean fname=firstName.validFirstName("2454534");
        Assert.assertFalse(fname);
    }

    @Test
    public void toTest_FirstNameGivesLattersAndNumericValue_ReturnTestFail(){
        UserRegistration firstName=new UserRegistration();
        boolean fname=firstName.validFirstName("Abbb4534");
        Assert.assertFalse(fname);
    }
}
