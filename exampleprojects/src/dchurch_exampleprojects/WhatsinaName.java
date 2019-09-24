package dchurch_exampleprojects;

public class WhatsinaName
{
   public static void main(String[] args) 
   {
      String myAge = "17";
      String myCost = "12.95";
      String myBool = "false";
      String myByte = "twelve";
       
      // Convert myAge to an integer
      int age = Integer.parseInt(myAge);
      System.out.println(age);

      // Convert myCost to a float
      float cost = Float.parseFloat(myCost);
      System.out.println(cost);

      // convert MyBool to a boolean
      boolean answer = Boolean.parseBoolean(myBool);
      System.out.println(answer);

      // convert myByte to a byte
      byte oops = Byte.parseByte(myByte);
      System.out.println(oops);
   }
}										