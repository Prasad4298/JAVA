/*
***********problems on betwise operators***************
*/
// Q) Accept number from user and check 1st nible and last nible is on of off.
//(1st 4 bites)

import java.lang.*;
import java.util.*;

class program320
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number : ");
    long iNo = sobj.nextLong();
    
    int iMask = 0Xf000000f;
    long iResult = 0; 

    iResult = iNo & iMask;

    if(iResult == iMask)
    {
      System.out.println("First nible and last nible is Completely on ");
    }
    else
    {
      System.out.println("First nible and last nible is off");
    }

  }
}