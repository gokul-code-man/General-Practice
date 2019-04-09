package com.practice;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    private int[] a = {1, 2, 3, 4};
    private int[] b = {2, 5, 7, 8};

    public HashSet<Integer> findCommonElements(int[] a, int[] b) {
        HashSet<Integer> resultset = new HashSet<Integer>();
        int alength = a.length;
        int blength = b.length;
        if (alength < blength) {
            for (int index = 0; index < a.length - 1; index++) {
                for (int bindex = 0; bindex < b.length - 1; bindex++) {
                    if (a[index] == b[bindex])
                        resultset.add(a[index]);
                }
            }
        } else {
            for (int bindex = 0; bindex < b.length - 1; bindex++) {
                for (int index = 0; index < a.length - 1; index++) {
                    if (b[bindex] == a[index])
                        resultset.add(b[bindex]);
                }
            }
        }
        return resultset;
    }

    public static void main(String[] args) {
        CommonElements obj = new CommonElements();
        HashSet<Integer> resultset = new HashSet<Integer>();
        resultset=obj.findCommonElements(obj.a,obj.b);
        System.out.println(resultset);
    }
}
