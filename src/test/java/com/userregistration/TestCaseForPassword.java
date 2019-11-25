package com.userregistration;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class TestCaseForPassword
{
        private String argument;
        private static UserRegistration password;
        private boolean expectedValidation;

        public TestCaseForPassword(String argument, boolean expectedValidation)
        {
            this.argument = argument;
            this.expectedValidation = expectedValidation;
        }

        @BeforeClass
        public static void initialize()
        {
            password = new UserRegistration();
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data()
        {
            Object[][] data = new Object[][] {
                    { "ashghg@123" ,false},
                    { "sonn65Adf@123" ,true},
                    { "gfhg" ,false},
                    { "267567" ,false},
                    { "gvhdfgh@@@@@@@" , false},
                    { "8679979D@123" ,true},
                    { "ghegAh@1213", true},
                    {"shhsjh1234", false},
                    {"45346$$$$$",false},
                    {"AAABBBBCCCC",false}};

            return Arrays.asList(data);
        }
        @Test
        public void Test()
        {
            Boolean result = password.validatePassword(this.argument);
            Assert.assertEquals(this.expectedValidation,result);
        }
 }

