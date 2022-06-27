/*
Accept the number from user and on 27th bit if it off.
by using programming friendly numbering skill (hexs).

0000	0100	0000	0000	0000	0000	0000	0000	
  0		  4		  0		  0		  0		  0		  0      0
*/
import java.lang.*;
import java.util.*;

class Bitwise
{
	public int OnBit(int iNo)	// on 27th bit
	{
		int iMarsk = 0X04000000;	
		int iResult = 0;

		iResult = iNo | iMarsk;
		return iResult;
	}
}

class program176
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



