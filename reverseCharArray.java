package com.practice;

public class reverseCharArray {

    public static void main(String args[])
    {
        char [] charSequence = {'a','b','G','o','k','u','l'};
        System.out.println(new String(charSequence));
        int count=0;
        for(count=charSequence.length-1;count>=0;count--)
        {
            System.out.print(charSequence[count]+" ");
        }
    }

}
