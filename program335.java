import java.lang.*;
import java.util.*;

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
    System.out.println(this.RID + "\t"+ this.Name+ "\t"+this.Salary);
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
    System.out.println("Marvellous costomized DBMS started successfully......!");
  }

  public void InsertData(String str, int value)
  {
    Student sobj = new Student(str,value);
    lobj.add(sobj);
  }
}

class program335
{
  public static void main(String arg[])
  {
    DBMS dobj = new DBMS();

    dobj.StartDBMS();
    dobj.InsertData("Prasad",50000);
    dobj.InsertData("Shruti",30000);
    dobj.InsertData("Sachin",40000);
    dobj.InsertData("Sagar",10000);
  }
}