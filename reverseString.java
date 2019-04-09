package com.practice;

public class reverseString {
    public static void main(String args[])
    {
        String orignalString="Gokul";
        StringBuffer strbfr = new StringBuffer(orignalString);
        System.out.println(strbfr.reverse());
    }
}
