package com.practice;

import java.util.Arrays;

public class CheckNull {
    public String checkMe()
    {
        try {
            String inputString = null;
            if (inputString.substring(2).equals("dd")) {
                return inputString;
            } else {
                return "gokul";
            }
        }
        catch(NullPointerException npe)
        {
            System.out.println("May be a null pointer exception");
            System.out.println(Arrays.toString(npe.getStackTrace()));
        }
        return "dd";
    }

    public static void main(String[] args) {
        CheckNull obj = new CheckNull();
        obj.checkMe();
    }
}
