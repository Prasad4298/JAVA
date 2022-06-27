/*

Accept the number from user and as well as position and toggle the bit at that position of number.
by creating dynamic mask.
by using programming friendly numbering skill (hexs).

														*
0000	0000	0000	0000	0000	0000	0000	0001	
  0		  0		  0		  0		  0		  0		  0      1

*/

import java.lang.*;
import java.util.*;

class Bitwise
{
	public int ToggleBit(int iNo, int iPos)	
	{
		int iMarsk = 0X00000001;	
		int iResult = 0;

		if((iPos <= 0) || (iPos > 32))
		{
			System.out.println("Invalid Position");
			return 0;
		}

		iMarsk = iMarsk << (iPos - 1);

		iResult = iNo ^ iMarsk;
		return iResult;
	}
}

class program180
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		int iValue = sobj.nextInt();

		System.out.println("Enter Position");
		int iPos = sobj.nextInt();

		Bitwise bobj = new Bitwise();

		int iRet = bobj.ToggleBit(iValue,iPos);

		System.out.println("output number :"+iRet);
	}
}



