package com.practice;

import java.util.ArrayList;
import java.util.List;

public class FactorFinder {

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

    public static void main(String[] args) {
        FactorFinder obj = new FactorFinder();
        ArrayList<Integer> factorList=new ArrayList<Integer>();
        for(int j=6;j<60;j++) {
            factorList = obj.factors(j);
            System.out.println("Factors for the number " + j + "= " + factorList);
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }
    }
}
