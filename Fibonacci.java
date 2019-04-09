package com.practice;

public class Fibonacci {
    public static void main(String args[])
    {
        int count=0,a=0,b=0,c=1;
        while(count<10)
        {
            a = b;
          //  System.out.println("a = "+a);
            b = c;
          //  System.out.println("b = c = "+b);
            c = a + b;
           // System.out.println("c = a+b = "+c);
            System.out.println(a+" "); // 0,
            count++;
        }
    }
}
