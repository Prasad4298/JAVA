/*
******** Sorting array (Selection Sort) ***********
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

    System.out.println("\nEnter elements:->");

    for(int i = 0; i < Arr.length; i++)
    {
      Arr[i] = sobj.nextInt();
    }
  }

  public void Display()
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("\nEntered elements are :->");
    for(int i = 0; i < Arr.length; i++)
    {
      System.out.print(Arr[i]+" ");
    }
    System.out.println();
  }

  public void BubbleSort()
  {}
  
  // Handle incresing and decreasing Sorting condition

  public void BubbleSort(char type)
  {
    int i = 0, j = 0, temp = 0;
    boolean Swap = false;

    if((type == 'i') || (type == 'I'))
    {
      for(i = 0; i < Arr.length; i++)
      {
        Swap = false;
        for(j = 0; j < Arr.length-i-1; j++)
        {
          if(Arr[j] > Arr[j+1])
          {
            temp = Arr[j];
            Arr[j] = Arr[j+1];
            Arr[j+1] = temp;
            Swap = true;
          }
        }
        System.out.println("Paass: "+(i+1));
        Display();

        if(Swap == false)
        {
          break;
        }
      }
    }
    
    if((type == 'd') || (type == 'D'))
    {
      for(i = 0; i < Arr.length; i++)
      {
        Swap = false;
        for(j = 0; j < Arr.length-i-1; j++)
        {
          if(Arr[j] < Arr[j+1])
          {
            temp = Arr[j];
            Arr[j] = Arr[j+1];
            Arr[j+1] = temp;
            Swap = true;
          }
        }
        System.out.println("\nPaass: "+(i+1));
        Display();

        if(Swap == false)
        {
          break;
        }
      }
    }
  }

  public void InsertionSort()
  {}

  // sorting in incresing order
  public void SelectionSort()
  {
    int i = 0, j = 0, min_index = 0, temp = 0;

    for(i = 0; i < Arr.length; i++)
    {
      min_index = i;
      for(j = i; j < Arr.length; j++)
      {
        if(Arr[min_index] > Arr[j])
        {
          min_index = j;
        }
      }
      temp = Arr[i];
      Arr[i] = Arr[min_index];
      Arr[min_index] = temp; 
    }
  }
}

class program355
{
  public static void main(String arr[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("\nEnter the size of Array: ");
    int size = sobj.nextInt();

    Array aobj = new Array(size);
    aobj.Accept();

    aobj.SelectionSort();
    System.out.println("\nData after Sorting.....!");
    aobj.Display();
  }
}