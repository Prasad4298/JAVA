/*
accept the n numbers from user and display this elements.
*/

import java.io.*;
import java.util.*;

class program297
{
  public static void main(String arg[])
  {
    int i = 0, j = 0;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the rows");
    int iRow = sobj.nextInt();
    
    System.out.println("Enter the rows");
    int iCol = sobj.nextInt();

    int Arr[][] = new int[iRow][iCol];

    System.out.println("Enter the elements :");
    for(i = 0; i < Arr.length; i++)
    {
      for(j = 0; j < Arr[i].length; j++)
      {
        Arr[i][j]= sobj.nextInt();
      }
    }

    System.out.println("Entered elements are : ");

    for(i = 0; i < Arr.length; i++)
    {
      for(j = 0; j < Arr[i].length; j++)
      {
        System.out.println(Arr[i][j]);
      }
    }
  }
}