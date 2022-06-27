// Accept number from user and display its factorial

import java.lang.*;
import java.util.*;

class Number
{
	private int iNo;

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number :");
		this.iNo = sobj.nextInt();	// this -> iNo ( -> is not allowed in java)
	}

	public void Display()
	{
		System.out.println("Value of number is:"+this.iNo);
	}

	public int Factorial()
	{
		int iFact = 1;
		int iCnt = 0;

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			// fancy coding with *short hand operator:
			
			iFact = iFact * iCnt;
		}
		return iFact;
	}
}

class program130
{
	public static void main(String arg[])
	{
		Number nobj = new Number();
		int iRet = 0;

		nobj.Accept();
		nobj.Display();

		iRet = nobj.Factorial();
		System.out.println("Factorial is: "+iRet);
	}
}