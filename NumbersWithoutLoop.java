package com.practice;

public class NumbersWithoutLoop {
    private int givenNumber;
    public void printNumber(int givenNumber)
    {
        if(givenNumber>0)
        {
            printNumber((givenNumber-1));
            System.out.print(givenNumber+" ");
        }
    }

    public static void main(String[] args) {
        NumbersWithoutLoop obj = new NumbersWithoutLoop();
        obj.printNumber(10);
    }
}
