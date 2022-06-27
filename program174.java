/*
Accept the number from user and check whether 14th bit is on or off.
by using programming friendly numbering skill (hexs).

0000	0000	0000	0000	0010	0000	0000	0000	
  0		  0		  0		  0		  2		  0		  0       0
*/
import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int iMarsk = 0X000002000;	// 14th bit sathi 2^20. // 1048576
		int iResult = 0;

		iResult = iNo & iMarsk;

		if(iResult == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class program174
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		int Value = sobj.nextInt();

		Bitwise bobj = new Bitwise();

		boolean bret = bobj.CheckBit(Value);

		if(bret == true)
		{
			System.out.println("Bit is on");
		}
		else
		{
			System.out.println("Bit is off");
		}		
	}
}



