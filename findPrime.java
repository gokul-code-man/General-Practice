package com.practice;

public class findPrime {
    public static void main(String args[])
    {
        int givenNumber=54,count=1;
        boolean isPrime=false;
        if((givenNumber==0)||(givenNumber==1))
        {
            isPrime=true;
            System.out.println("Given number is not prime");
        }
        else {
            for (count = 2; count <= givenNumber / 2; count++) {
                if (givenNumber % count == 0) {
                    isPrime = true;
                    break;
                }
            }
        }
        if(isPrime)
            System.out.println("Given number is not a prime number");
        else
            System.out.println("Given number is a prime ");

    }
}
