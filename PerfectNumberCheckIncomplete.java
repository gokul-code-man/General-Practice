package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class PerfectNumberCheckIncomplete {

    public ArrayList<Integer> factors(int givenNumber)
    {
        ArrayList<Integer> resultList=new ArrayList<Integer>();
        if(givenNumber<3)
        {
            System.out.println("There are no factors for this number");
        }

        for(int i=2;i<givenNumber/2;i++)
        {
            if(givenNumber%i==0)
            {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public int sumOfFactors(ArrayList<Integer> numlist)
    {
        int sum=0;
        Iterator<Integer> it = numlist.iterator();
        while(it.hasNext())
        {
            sum=sum+it.next();
        }
        return sum+1;
    }

    public static void main(String[] args) {
        PerfectNumberCheckIncomplete obj = new PerfectNumberCheckIncomplete();
        ArrayList<Integer> factorList=new ArrayList<Integer>();
        for(int j=3;j<60;j++) {
            factorList = obj.factors(j);
            System.out.println("Factor list for "+j+ "is "+factorList);
            int factorsum=obj.sumOfFactors(factorList);
            System.out.println("Sum of factors is "+factorsum);
            if(factorsum==j)
            {
                System.out.println(j + " is a perfect number");
            }
        }
    }
}
