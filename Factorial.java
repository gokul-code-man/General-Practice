package com.practice;

public class Factorial {
    public long findFactorial(int givenNumber)
    {
        long result=1;
        int count=1;
        while(count<=givenNumber)
        {
            result=result*count;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        long result=obj.findFactorial(14);
        System.out.println("Factorial of number 5 is "+result);
    }
}
