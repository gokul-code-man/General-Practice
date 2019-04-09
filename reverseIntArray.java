package com.practice;
import java.util.Arrays;

public class reverseIntArray {
    public static void main(String args[])
    {
        int iarray[]={1,2,3,4};
        int start=0;
        int end=iarray.length-1;
        int temp=0;
        while (start<end)
        {
            temp=iarray[start];
            iarray[start]=iarray[end];
            iarray[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(iarray));
    }
}
