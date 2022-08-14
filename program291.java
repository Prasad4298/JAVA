/*
Accept two string from user and check its anagram or not.
*/

import java.io.*;
import java.util.*;

class program291
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the first String :");
    String str1 = sobj.nextLine();

    str1 = str1.toLowerCase();

    char arr[] = str1.toCharArray();
    int Frequency1[] = new int[26];

    System.out.println("Enter the second String :");
    String str2 = sobj.nextLine();

    str2 = str2.toLowerCase();

    char brr[] = str2.toCharArray();
    int Frequency2[] = new int[26];

    int i = 0;

    for(i = 0; i < arr.length; i++)
    {
      Frequency1[arr[i]-'a']++;
    }

    for(i = 0; i < brr.length; i++)
    {

    }
  

  }
}