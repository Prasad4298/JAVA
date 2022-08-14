/*
******** Sorting array (Bubble Sort) ***********
*/
import java.lang.*;
import java.util.*;

interface MarvellousSort
{
  public void Accept();
  public void Display();
  public void BubbleSort();
  public void InsertionSort();
  public void SelectionSort();
}

class Array implements MarvellousSort
{
  public int Arr[];
  
  public Array(int iSize)
  {
    Arr = new int[iSize];
  }

  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter elements");
    for(int i = 0; i < Arr.length; i++)
    {
      Arr[i] = sobj.nextInt();
    }
  }

  public void Display()
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter elements");
    for(int i = 0; i < Arr.length; i++)
    {
      System.out.println(Arr[i]);
    }
  }
  
  // Array kasahi asla tari hi method array la incresing order ni Sort Karel
  public void BubbleSort()
  {
    int i = 0, j = 0, temp = 0;

    for(i = 0; i < Arr.length; i++)
    {
      for(j = 0; j < Arr.length-i-1; j++)
      {
        if(Arr[j] > Arr[j+1])
        {
          temp = Arr[j];
          Arr[j] = Arr[j+1];
          Arr[j+1] = temp;
        }
      }
    }
  }

  public void InsertionSort()
  {}

  public void SelectionSort()
  {}
}

class program350
{
  public static void main(String arr[])
  {
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter the size of Array: ");
    int size = sobj.nextInt();

    Array aobj = new Array(size);
    aobj.Accept();
    aobj.Display();

    aobj.BubbleSort();
    System.out.println("Data after Sorting:");
    aobj.Display();
  }
}