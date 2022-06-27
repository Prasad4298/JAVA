/*
Accept the number from user and toggle 4th bit on that number.
by using programming friendly numbering skill (hexs).

0000	0000	0000	0000	0000	0000	0000	1000	
  0		  0		  0		  0		  0		  0		  0      8
*/
import java.lang.*;
import java.util.*;

class Bitwise
{
	public int ToggleBit(int iNo)	// toggle 4th bit
	{
		int iMarsk = 0X00000008;	
		int iResult = 0;

		iResult = iNo ^ iMarsk;
		return iResult;
	}
}

class program177
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		int Value = sobj.nextInt();

		Bitwise bobj = new Bitwise();

		int bret = bobj.ToggleBit(Value);

		System.out.println("output number :"+bret);
	}
}



