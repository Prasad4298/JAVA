/*
Accept string from user and Display length of largest words.

*/

import java.io.*;
import java.util.*;

class program281
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
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i].length() > iMax)
      {
        iMax = arr[i].length();
      }
    }
    System.out.println("Length of largest word is : "+iMax);
  }
}