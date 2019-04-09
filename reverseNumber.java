package com.practice;

public class reverseNumber {
    private int number;
    public static int reverseNumber(int num)
    {
        if(num<10 && num>=0)
        {
            return num;
        }
        int reversedNumber=0;
        while(num>0) {
            reversedNumber=reversedNumber+num%10;
            reversedNumber=reversedNumber*10;
            num=num/10;
            }
                return reversedNumber/10;
        }
        public static void main(String args[])
        {
            int rev=reverseNumber(1021);
            System.out.println("The reversed number is "+rev);
        }
    }

