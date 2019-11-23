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

    // for Last Name
    @Test
    public void toTest_LastNameGivesAllValid_ReturnTrue() {
        UserRegistration lastName = new UserRegistration();
        boolean Lname=lastName.validLastName("Bankar");
        Assert.assertTrue(Lname);
    }
    @Test
    public void toTest_LastNameGivesFirstThreeLatter_ReturnTestPass() {
        UserRegistration lastName = new UserRegistration();
        boolean lname=lastName.validLastName("Ban");
        Assert.assertTrue(lname);
    }
    @Test
    public void toTest_LastNamGivesSmallLatters_ReturnTestFail(){
        UserRegistration lastName=new UserRegistration();
        boolean lname=lastName.validLastName("bankar");
        Assert.assertFalse(lname);
    }
    @Test
    public void toTest_LastNameGivesTwoLatters_ReturnTestFail(){
        UserRegistration lastName=new UserRegistration();
        boolean lname=lastName.validLastName("Ba");
        Assert.assertFalse(lname);
    }
    @Test
    public void toTest_LastNameGivesNumericValue_ReturnTestFail(){
        UserRegistration lastName=new UserRegistration();
        boolean lname=lastName.validLastName("2454534");
        Assert.assertFalse(lname);
    }

    @Test
    public void toTest_LastNameGivesLattersAndNumericValue_ReturnTestFail(){
        UserRegistration lastName=new UserRegistration();
        boolean lname=lastName.validFirstName("B3gs534");
        Assert.assertFalse(lname);
    }

}
