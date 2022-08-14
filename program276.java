/*
Accept string from user and calculate small case character.
*/

import java.io.*;
import java.util.*;

class program276
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the String :");
    String str = sobj.nextLine();

    char arr[] = str.toCharArray();
    int iCnt = 0;

    for(int i = 0; i < arr.length; i++)
    {
      if((arr[i] >= 'a') && (arr[i] <= 'z'))
      {
        iCnt++;
      }
    }

    System.out.println("Number of small character is : "+iCnt);
  }
}