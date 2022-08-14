/*
*********** problems on String ***************

Q) Accept Two String from user and Disply the frequency of  each and every character.
(by using HashMap)

str1 : Hello
str2 : loHel

str1 : Marvellous
str2 : ousMarvell     
*/

import java.lang.*;
import java.util.*;

class program327
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter first string :");
    String str = sobj.nextLine();

    char Arr[] = str.toCharArray();

    HashMap<Character, Integer> hobj = new HashMap<>();   // its generic
    int frequency = 0;

    for(char ch : Arr)    // for(int i = 0; i < Arr.length; i++)
    {
      if(hobj.containsKey(ch))
      {
        frequency = hobj.get(ch);
        hobj.put(ch, frequency + 1);
      }
      else
      {
        hobj.put(ch, 1);
      }
    }
    System.out.println(hobj);
  }
}
