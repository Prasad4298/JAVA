/*
Accept the matrix from user and 
display the largest elements from matrix.
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

  public int Maximum()
  {
    int iMax = Arr[0][0];

    for(int i = 0; i < iRow; i++)
    {
      for(int j = 0; j < iCol; j++)
      {
        if(Arr[i][j] > iMax)
        {
          iMax = Arr[i][j];
        }
      }
    }
    return iMax;
  }
}

class program304
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

    int iRet = mobj.Maximum();
    System.out.println("Maximum elements from matrix is : "+iRet);
  }
}