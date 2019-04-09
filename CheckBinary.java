package com.practice;

public class CheckBinary {

    long num;
    public boolean isBinary(long number)
    {
        long remainder=0;
        while(number!=0)
        {
            remainder=number%10;
            if(remainder>1)
            {
                return false;
            }
            number=number/10;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result=false;
        CheckBinary chbObj = new CheckBinary();
        result=chbObj.isBinary(121);
        if(result)
        {
            System.out.println("Number is binary");
        }
        else
        {
            System.out.println("Number is not binary");
        }
    }
}
