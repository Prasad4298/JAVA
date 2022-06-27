/*
Accept the number from user and on 4th bit if it off.
by using programming friendly numbering skill (hexs).

0000	0000	0000	0000	0000	0000	0000	1000	
  0		  0		  0		  0		  0		  0		  0      8
*/
import java.lang.*;
import java.util.*;

class Bitwise
{
	public int OnBit(int iNo)	// on 4th bit
	{
		int iMarsk = 0X00000008;	
		int iResult = 0;

		iResult = iNo | iMarsk;
		return iResult;

	}
}

class program175
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		int Value = sobj.nextInt();

		Bitwise bobj = new Bitwise();

		int bret = bobj.OnBit(Value);

		System.out.println(bret);
	}
}



