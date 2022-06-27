// Que. accept number from user and return factorial of that number.

//	4 			24
// 	1*2*3*4		24

// best programming:

#include<iostream>
using namespace std;

class Number
{
	private:
		int iNo;	// characteristics

	public : 
		// Behaviours

		void Accept()	// Setter
		{
			cout<<"Enter the Value:"<<endl;
			cin>> this -> iNo;
		}

		void Display()	// Gatter
		{
			cout<<"Value is:"<< this -> iNo <<endl;
		}

	int Factorial()
	{
		int iFact = 1;
		int iCnt = 0;

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			// fancy coding with *short hand operator:
			
			iFact *= iCnt; // iFact = iFact * iCnt;
		}
		return iFact;
	}
};

int main()
{
	Number nobj;

	int iRet = 0;

	//cout<<nobj.iNo;	error
	
	nobj.Accept();
	nobj.Display();

	iRet = nobj.Factorial();

	cout<<"Factorial is : "<<iRet<<endl;
	
	return 0;
}