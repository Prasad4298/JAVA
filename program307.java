/*
Accept the matrix from user and 
inter change the content of Columns

1st Columns interchange with 2nd Columns
3rd Columns interchange with 4th Columns

and odd number of Columns asel tar ti Col tashich rahil

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

  public void SwapCol()
  {
    int iTemp = 0;

    for(int i = 0; i < iRow; i++)
    {
      for(int j = 0; j < iCol-1; j += 2)
      {
        iTemp = Arr[i][j];
        Arr[i][j] = Arr[i][j+1];
        Arr[i][j+1] = iTemp;
      }
    }
  }
}

class program307
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

    mobj.SwapCol();
    System.out.println("Data After Swaping is :");
    mobj.Display();
  }
}