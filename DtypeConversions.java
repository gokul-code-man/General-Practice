package com.practice;

public class DtypeConversions {

    public int StringToInteger(String str)
    {
        int i = Integer.valueOf(str);
        return i;
    }

    public String IntegerToString(int i)
    {
        String temp = Integer.toString(i);
        return temp;
    }

    public static void main(String[] args) {
        DtypeConversions obj = new DtypeConversions();
        int result=obj.StringToInteger("45");
        String resultStr = obj.IntegerToString(55);
        System.out.println("The end result of StringToInteger is "+result);
        System.out.println("The end result of IntegerToString is "+resultStr);
    }
}
