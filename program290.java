/*
Accept  string from user and display frequency of each characters.

*/

import java.io.*;
import java.util.*;

class program290
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the String :");
    String str = sobj.nextLine();
    str = str.toLowerCase();

   char arr[] = str.toCharArray();
   int Frequency[] = new int[26];
   int i = 0;

   for(i = 0; i < arr.length; i++)
   {
    Frequency[arr[i] - 'a']++;
   }

    int iMax = 0;
    int iPos = 0;
   for(i = 0; i < Frequency.length; i++)
   {
    if(Frequency[i] > 0)
    {
      if(Frequency[i] > iMax)
      {
        iMax = Frequency[i];
        iPos = i;
      }
      System.out.println((char)(iPos + 'a') + " occurs" + iMax + "number of times in the word");
    }
   }
  }
}