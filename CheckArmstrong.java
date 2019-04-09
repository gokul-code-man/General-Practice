package com.practice;

public class CheckArmstrong {
    long number;
    public int checkNumberOfDigits(int number)
    {
        int count=0;
        while(number!=0)
        {
            count++;
            number=number/10;
        }
        System.out.println("Count is "+count);
        return count;
    }

    public boolean isArmstrong(int noOfDigits,int number)
    {
        int rem=0,temp=number;
        double sum=0;
        while(number!=0)
        {
            rem=number%10;
            sum=sum+Math.pow((double)rem,(double) noOfDigits);
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
        int noOfDigits=obj.checkNumberOfDigits(371);
        boolean result=obj.isArmstrong(noOfDigits,381);
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
