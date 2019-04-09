package com.practice;

public class missingNumber {
  public int getMissingNumber(int []givenlist)
  {
      int totalElements=givenlist.length-1;
      System.out.println("Total Elements ="+totalElements);
      int sum1=0,sum2=0;
      for(int i=0;i<=totalElements;i++)
      {
          sum1=sum1+givenlist[i];
      }
     // System.out.println("Sum1 = "+sum1);
      int a = givenlist[0];
      int l = givenlist[givenlist.length-1];
      sum2=((a+l)*totalElements)/2;

     // sum2=totalElements/2*(givenlist[0]+givenlist[totalElements]);
      System.out.println("Sum2 = "+sum2);
      int missingNumber=sum2-sum1;
      return Math.abs(missingNumber);
  }

    public static void main(String[] args) {
        missingNumber obj=new missingNumber();
        int a[]={1,2,4,5};
        int missedNumber=obj.getMissingNumber(a);
        System.out.println("Missing number is "+missedNumber);
    }
}
