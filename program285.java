/*
Accept two string from user and check anagram or not.
(number of letters and frequency of letters should be same)

lisent      cat       study        race         night
silent      act       dusty        care         thing

*/

import java.io.*;
import java.util.*;

class program285
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the String :");
    String str = sobj.nextLine();

    String newstr = str.replaceAll("\\s+"," ");
    String newstr2 = newstr.trim();

    String arr[] = newstr2.split(" ");

    StringBuffer finalstr = new StringBuffer();

    for(int i = 0; i < arr.length; i++)
    {
      StringBuffer sb = new StringBuffer(arr[i]);
      finalstr.append((sb.reverse()).append(" "));
    }
    
    String finalstr2 = new String(finalstr);
    System.out.println(finalstr2.trim());
  }
}