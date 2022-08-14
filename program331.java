/*
*********** problems on String ***************

Q) Accept  String from user and Display frequecy of word from that string.
(by using HashMap)

str1 : Hello
str2 : loHel

output : l = 2   
*/

import java.lang.*;
import java.util.*;

class program331
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter string :");
    String str = sobj.nextLine();

    String Arr[] = str.split(" ");

    HashMap<String, Integer> hobj = new HashMap<>();   // its generic
    int frequency = 0;

    for(String ch : Arr)    // for(int i = 0; i < Arr.length; i++)
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

    Set<String> setobj = hobj.keySet();
    int iMax = 0;
    String c = " ";
    
    for(String value : setobj)
    {
      if(hobj.get(value) > iMax)
      {
        iMax = hobj.get(value);
        c = value;
      }
    }
    System.out.println(c +" Word Occurs Maximum number of times is : "+iMax);
  }
}
