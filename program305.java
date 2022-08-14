/*
Accept the matrix from user and 
display the Smallest elements from matrix.
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

  public int Minimum()
  {
    int iMin = Arr[0][0];

    for(int i = 0; i < iRow; i++)
    {
      for(int j = 0; j < iCol; j++)
      {
        if(Arr[i][j] < iMin)
        {
          iMin = Arr[i][j];
        }
      }
    }
    return iMin;
  }
}

class program305
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

    int iRet = mobj.Minimum();
    System.out.println("Smallest elements from matrix is : "+iRet);
  }
}