/*
Accept string from user and calculate number of words.(this code handle all white spaces)

*/

import java.io.*;
import java.util.*;

class program279
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the String :");
    String str = sobj.nextLine();

    String newstr = str.replaceAll("\\s+"," ");
    String newstr2 = newstr.trim();

    String arr[] = newstr2.split(" ");

    System.out.println("Number of words are : "+arr.length);
  }
}