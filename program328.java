/*
*********** problems on String ***************

Q) Accept Two String from user and Display the character 
(by using HashMap)

str1 : Hello
str2 : loHel

output : l = 2   
*/

import java.lang.*;
import java.util.*;

class program328
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

    Set<Character> setobj = hobj.keySet();
    System.out.println("Keys in HashMap : ");
    System.out.println(setobj);
  }
}
