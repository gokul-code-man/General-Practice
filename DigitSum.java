package com.practice;

public class DigitSum {

    public long sumOfDigits(int givenNumber)
    {
        int rem=0,sum=0;
        if(givenNumber<10)
        {
            return givenNumber;
        }
        else {
            while (givenNumber != 0) {
                rem = givenNumber % 10;
                sum = sum + rem;
                givenNumber = givenNumber / 10;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        DigitSum obj = new DigitSum();
        long sum=obj.sumOfDigits(1112);
        System.out.println("Sum of digits = "+sum);
    }
}
