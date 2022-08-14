/*
Accept string from user and Display largest words.

*/

import java.io.*;
import java.util.*;

class program282
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the String :");
    String str = sobj.nextLine();

    String newstr = str.replaceAll("\\s+"," ");
    String newstr2 = newstr.trim();

    String arr[] = newstr.split(" ");

    int iMax = 0;
    int iPos = 0;

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i].length() >= iMax)
      {
        iMax = arr[i].length();
        iPos = i;
      }
    }
    System.out.println("Length of largest word is : "+iMax);
     System.out.println("largest word is : "+arr[iPos]);
  }
}