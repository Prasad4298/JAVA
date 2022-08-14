/*
***********problems on String ***************
*/
/*
Q) Accept Two String from user and check 1st string is rotation of 2nd string .

str1 : Hello
str2 : loHel

str1 : Marvellous
str2 : ousMarvell     
*/

import java.lang.*;
import java.util.*;

class program326
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter first string :");
    String str1 = sobj.nextLine();

    System.out.println("Enter rotated string :");
    String str2 = sobj.nextLine();

    if(str1.length() != str2.length())
    {
      System.out.println("Strings are not in rotation");
      return;
    }

    String str3 = str1 + str1;

    if(str3.contains(str2))
    {
      System.out.println("Strings are in rotation : ");
    }
    else
    {
      System.out.println("Strings are not in rotation : ");
    }
  }
}

/*
concated compairision algorithum

str3 = HelloHello

str3 madhe str2 shodhayach
*/