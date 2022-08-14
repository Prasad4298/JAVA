/*
accept the n numbers from user and display Addition of that elements;
*/

import java.io.*;
import java.util.*;

class program298
{
  public static void main(String arg[])
  {
    int i = 0, j = 0, iSum = 0;

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

    for(i = 0; i < Arr.length; i++)
    {
      for(j = 0; j < Arr[i].length; j++)
      {
        if((Arr[i][j] % 2) == 0)
        {
          iSum = iSum + Arr[i][j];
        }
      }
    }

    System.out.println("Addition of even elements is : " + iSum);
  }
}