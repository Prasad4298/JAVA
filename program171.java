/*
Accept the number from user and check whether 7th bit is on or off.

*/
import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int iMarsk = 64;	// 7th bit sathi 2^6.
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

class program171
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



