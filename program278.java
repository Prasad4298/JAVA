/*
Accept string from user and calculate number of words.(remove extra white spaces with one white space)
(but is not handle starting white spaces)
*/

import java.io.*;
import java.util.*;

class program278
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the String :");
    String str = sobj.nextLine();

    String newstr = str.replaceAll("\\s+"," ");
    String arr[] = newstr.split(" ");

    System.out.println("Number of words are : "+arr.length);
  }
}