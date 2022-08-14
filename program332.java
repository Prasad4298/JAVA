/*
*********** problems on String ***************

Q) Accept  String and one word from user and search one word from string and replace that word into string
   and display all statment.
*/

import java.lang.*;
import java.util.*;

class program332
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter string :");
    String str = sobj.nextLine();

    System.out.println("Enter word to search from String :");
    String str1 = sobj.nextLine();

    System.out.println("Enter replace word from  :");
    String str2 = sobj.nextLine();

    String Arr[] = str.split(" ");

    System.out.println("String after replace word is : ");  

    for(int i = 0; i < Arr.length; i++)
    {
      if(Arr[i] == str1)
      {
        Arr[i] = str2;
      }
      System.out.print(Arr[i]+" ");
    }
  }
}
