/*
Accept string from user and calculate number of words.(this code handle only one space between each words only).
(code not handle multiple white spaces in between words)
*/

import java.io.*;
import java.util.*;

class program277
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the String :");
    String str = sobj.nextLine();

    String arr[] = str.split(" ");

    System.out.println("Number of words are :"+arr.length);
  }
}