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
    this.name = str;
    this.Salary = value;
  }
}

class StudentClass
{
  public static void main(String arg[])
  {
    Student obj = new Student("Prasad",1000);
    System.out.println(obj.RID);
    System.out.println(obj.Name);
    System.out.println(obj.Salary);  

    Student obj1 = new Student("Prasad",1000);
    System.out.println(obj1.RID);
    System.out.println(obj1.Name);
    System.out.println(obj1.Salary);  
  }
}