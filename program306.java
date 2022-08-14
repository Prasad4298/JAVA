/*
Accept the matrix from user and 
inter change the content of Rows

1st Row interchange with 2nd Row
3rd Row interchange with 4th Row

and odd number of Row asel tar ti row tashich rahil

*/

import MarvellousMatrix.Matrix;

import java.lang.*;
import java.util.*;

class MyMatrix extends Matrix
{
  public MyMatrix(int a, int b)
  {
    super(a,b);  // super key words should be at 1st line in constructor
  }

  public void SwapRow()
  {
    int iTemp = 0;

    for(int i = 0; i < iRow-1; i += 2)
    {
      for(int j = 0; j < iCol; j++)
      {
        iTemp = Arr[i][j];
        Arr[i][j] = Arr[i+1][j];
        Arr[i+1][j] = iTemp;
      }
    }
  }
}

class program306
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the number of rows :");
    int X = sobj.nextInt();

    System.out.println("Enter the number of columns :");
    int Y = sobj.nextInt();

    MyMatrix mobj = new MyMatrix(X,Y);
    mobj.Accept();
    mobj.Display();

    mobj.SwapRow();
    System.out.println("Data After Swaping is :");
    mobj.Display();
  }
}