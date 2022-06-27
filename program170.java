/*
Accept the number from user and check whether 3rd bit is on or off.

*/
import java.lang.*;
import java.util.*;

class Bitwise
{
	public boolean CheckBit(int iNo)
	{
		int iMarsk = 4;		// 3rd bit sathi 2^2.
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

class program170
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



