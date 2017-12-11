/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microfocus.forpractice;

import java.util.Arrays;


/**
 *
 * @author srivathg
 */
public class checkFibonacciSeries
{
    public static void main(String args[])
    {
        int i = 0;
        int[] iArr = new int[11];
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 3;
        for (i = 3; i <= 10; i++)
        {
            iArr[i] = iArr[i - 1] + iArr[i - 2];
        }
        System.out.println(Arrays.toString(iArr));
    }
}

