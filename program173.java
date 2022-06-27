/*
Accept the number from user and check whether 21th bit is on or off.
by using programming friendly numbering skill (hexs).

*/
import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int iMarsk = 0X00100000;	// 21th bit sathi 2^20. // 1048576
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

class program173
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



