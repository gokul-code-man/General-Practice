package com.practice;

public class CheckArmstrong {
    long number;
    public boolean isArmstrong(int number)
    {
        int rem=0;int temp=number;
        double sum=0;
        while(number!=0)
        {
            rem=number%10;
            //sum=sum+Math.pow((double)rem,(double) noOfDigits);
            sum=sum+Math.pow(rem,3);
            number=number/10;
        }
        System.out.println("Final sum is "+(int)sum);
        System.out.println("Final number is "+number);
        if((int)sum==temp)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        CheckArmstrong obj=new CheckArmstrong();
        boolean result=obj.isArmstrong(371);
        if(result)
        {
            System.out.println("Its an armstrong number");
        }
        else
        {
            System.out.println("Its not an armstrong number");
        }
    }
}
