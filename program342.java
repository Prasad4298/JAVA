/*
Delete specific data from linkedlist
*/

import java.lang.*;
import java.util.*;

// create table student(RID int, Name varchar(255), Salary int);
// Database table / schema
class Student
{
  public int RID;
  public String Name;
  public int Salary;

  private static int Generator;

  static
  {
    Generator = 0;
  }

  public Student(String str, int value)
  {
    this.RID = ++Generator;
    this.Name = str;
    this.Salary = value;
  }

  public void DisplayData()
  {
    System.out.println(this.RID + "\t" + this.Name + "\t" + this.Salary);
  }
}

class DBMS
{
  public LinkedList <Student> lobj;

  public DBMS()
  {
    lobj = new LinkedList<>();
  }

  public void StartDBMS()
  {
    System.out.println("Marvellous customised DBMS started succesfully....");
  }

  public void InsertData(String str, int value)
  {
    Student sobj = new Student(str,value);
    lobj.add(sobj);
  }

  public void DisplayAll()
  {
    for(Student sref : lobj)
    {
      sref.DisplayData();
    }
  }

  // display by RID
  public void DisplaySpecific(int rid)
  {
    for(Student sref : lobj)
    {
      if(sref.RID == rid)
      {
        sref.DisplayData();
      }
    }
  }

  // display by Name
  public void DisplaySpecific(String str)
  {
    for(Student sref : lobj)
    {
      if(str.equals(sref.Name))
      {
        sref.DisplayData();
      }
    }
  }

  // delete by RID
  public void DeleteSpecific(int rid)
  {
    int index = 0;

    for(Student sref : lobj)
    {
      if(sref.RID == rid)
      {
        lobj.remove(index);
        break;
      }
      index++;
    }
  }

  // display by Name
  public void DeleteSpecific(String str)
  {
    int index = 0;

    for(Student sref : lobj)
    {
      if(str.equals(sref.Name))
      {
        lobj.remove(index);
        break;
      }
      index++;
    }
  }

  public void AggregateMax()
  {
    int iMax = 0;
    Student temp = null;

    for(Student sref : lobj)
    {
      if(sref.Salary > iMax)
      {
        iMax = sref.Salary;
        temp = sref;
      }
    }
    System.out.println("Maximum salary is :"+iMax);
    temp.DisplayData();
  }

  public void AggregateMin()
  {
    int iMin = (lobj.getFirst()).Salary;
    Student temp = lobj.getFirst();

    for(Student sref : lobj)
    {
      if(sref.Salary < iMin)
      {
        iMin = sref.Salary;
        temp = sref;
      }
    }
    System.out.println("Minimum salary is :"+iMin);
    temp.DisplayData();
  }

  public void AggregateSum()
  {
    long iSum = 0;
    Student temp = lobj.getFirst();

    for(Student sref : lobj)
    {
      iSum = iSum + sref.Salary;
    }
    System.out.println("Summation of salaries is :"+iSum);
  }

  public void AggregateAvg()
  {
    long iSum = 0;
    Student temp = lobj.getFirst();

    for(Student sref : lobj)
    {
      iSum = iSum + sref.Salary;
    }
    System.out.println("Average of salaries is :"+iSum/(lobj.size()));
  }

  public void AggregateCount()
  {
    System.out.println("Count is : "+lobj.size());
  }
}

class program342
{
  public static void main(String arg[])
  {
    DBMS dobj = new DBMS();

    dobj.StartDBMS();
    dobj.InsertData("Piyush",1000);
    dobj.InsertData("Sakshi",2000);
    dobj.InsertData("Sachin",3000);
    dobj.InsertData("Maya",6000);
    dobj.InsertData("Manu",10000);
    dobj.InsertData("Suraj",5000);
    dobj.InsertData("Arya",8000);

    /*
    dobj.DisplayAll();
    
    dobj.DisplaySpecific(2);
    dobj.DisplaySpecific("Piyush");

    dobj.DeleteSpecific(2);
    dobj.DeleteSpecific("Sakshi");
    dobj.DisplayAll();

    dobj.AggregateMax();
    dobj.AggregateMin();

    dobj.AggregateSum();
    */

    dobj.AggregateMax();
    dobj.AggregateMin();

    dobj.AggregateSum();

    dobj.AggregateAvg();
    dobj.AggregateCount();

    dobj.DisplayAll();
    
  }
}



