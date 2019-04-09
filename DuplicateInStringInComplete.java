package com.practice;

import java.util.HashSet;

public class DuplicateInStringInComplete {

    public void removeDuplicate(String givenString)
    {
        String resultString=null;
        boolean flag=false;
        HashSet<Character> rString=new HashSet<Character>();
        for(int i=0;i<givenString.length();i++)
        {
            for(int j=i+1;j<givenString.length();j++)
            {
                if(givenString.charAt(i)!=givenString.charAt(j))
                {
                    System.out.print(givenString.charAt(i));
                    System.out.println(" ");
                }
            }
            System.out.println("=====================");
        }
    }

    public static void main(String[] args) {
        DuplicateInStringInComplete obj=new DuplicateInStringInComplete();
        obj.removeDuplicate("aabcddef");

    }
}
