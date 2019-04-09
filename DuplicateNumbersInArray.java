package com.practice;

import java.util.HashSet;

public class DuplicateNumbersInArray {
    public HashSet<Integer> findDuplicate(int [] givenArray)
    {
        int index=0,bindex=0;
        HashSet<Integer> resultset=new HashSet<Integer>();
        for(index=0;index<=givenArray.length-2;index++)
        {
            for(bindex=index+1;bindex<=givenArray.length-1;bindex++)
            {
                if(givenArray[index]==givenArray[bindex])
                {
                    resultset.add(givenArray[index]);
                }
            }
        }
        return resultset;
    }

    public static void main(String[] args) {
        DuplicateNumbersInArray obj = new DuplicateNumbersInArray();
        HashSet<Integer> resultset = new HashSet<Integer>();
        int [] arr = {1,1};
        resultset=obj.findDuplicate(arr);
        if(resultset.size()!=0)
        System.out.println(resultset);
        else
            System.out.println("There are no duplicate numbers");
    }
}
