/*
***********problems on betwise operators***************
*/
// Q) Accept Two number from user and Display the position of common on bits.

import java.lang.*;
import java.util.*;

class program325
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter First number : ");
    int iNo1 = sobj.nextInt();

    System.out.println("Enter Second number : ");
    int iNo2 = sobj.nextInt();
    
    int iNo = iNo1 & iNo2;

    int iMask = 0x00000001;
    int iResult = 0;
    int iCnt = 0;

    for(int i = 1; i <= 32; i++)
    {
      iResult = iNo & iMask;
      if(iResult == iMask)
      {
        System.out.println("position of on bits are : "+i);
      }
      iMask = iMask << 1;
    }
  }
}