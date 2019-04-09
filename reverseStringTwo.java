package com.practice;

public class reverseStringTwo {
    public static void main(String args[])
    {
        String originalString="Gokul";
        char charSqnc[]=originalString.toCharArray();
        int i=0;
        for(i=charSqnc.length-1;i>=0;i--)
        {
            System.out.println(charSqnc[i]);
        }
    }
}
