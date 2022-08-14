/*
Accept two string from user and check its anagram or not.
*/

import java.io.*;
import java.util.*;

class program295
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the first String :");
    String str1 = sobj.nextLine();

    System.out.println("Enter the second String :");
    String str2 = sobj.nextLine();

    char arr[] = (str1.toLowerCase()).toCharArray();
    char brr[] = (str2.toLowerCase()).toCharArray();
    
    Arrays.sort(arr); // ascending order
    Arrays.sort(brr);

    if(Arrays.equals(arr,brr))
    {
      System.out.println("Strings are anagram");
    }
    else
    {
      System.out.println("Strings are not anagram");
    }

  }
}