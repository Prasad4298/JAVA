/*
Rewrite the code by import package
*/

import MarvellousMatrix.Matrix;

import java.lang.*;
import java.util.*;

class program303
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the number of rows :");
    int X = sobj.nextInt();

    System.out.println("Enter the number of columns :");
    int Y = sobj.nextInt();

    Matrix mobj = new Matrix(X,Y);
    mobj.Accept();
    mobj.Display();

  }
}