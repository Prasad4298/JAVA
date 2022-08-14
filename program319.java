/*
***********problems on betwise operators***************
*/
// Q) Accept number from user and check 1st nible(1st 4 bites) is on of off.

import java.lang.*;
import java.util.*;

class program319
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter number : ");
    int iNo = sobj.nextInt();
    
    int iMask = 0X0000000f;
    int iResult = 0; 

    iResult = iNo & iMask;

    if(iResult == iMask)
    {
      System.out.println("First nible is Completely on ");
    }
    else
    {
      System.out.println("First nible is off");
    }

  }
}