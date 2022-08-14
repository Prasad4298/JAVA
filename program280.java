/*
Accept string from user and Display  words.

*/

import java.io.*;
import java.util.*;

class program280
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the String :");
    String str = sobj.nextLine();

    String newstr = str.replaceAll("\\s+"," ");
    String newstr2 = newstr.trim();

    String arr[] = newstr.split(" ");

    for(int i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i]);
    }
  }
}