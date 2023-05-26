package Oops.Interface;

//Giving One Implementation For Multiple Abstract ()'s in Multiple Intefaces

interface Int1
{
	public void m1(); //abstract m1() in Int1
}

interface Int2
{
	public void m1(); //abstract m1() in Int2
}

interface Int3
{
	public void m1(); //abstract m1() in Int3
}

public class OneImplementation_Child implements Int1,Int2,Int3
{
	public void m1() //Overriden abstract m1() in All Interfaces
	{
		//Same Implementation For All Abstract ()'s in Multiple Intefaces
		System.out.println("Same Implementation Given For All Abstract()'s");
	}
	public static void main(String[] args)
	{
		
	OneImplementation_Child one=new OneImplementation_Child();//Object For Child Class
	one.m1(); //Same Implementation Given For All Abstract()'s
	
	Int1 i1=(Int1)one; //Upcasting for Int1
	i1.m1(); //Same Implementation Given For All Abstract()'s
	
	Int2 i2=(Int2)one; //Upcasting for Int2
	i2.m1(); //Same Implementation Given For All Abstract()'s
	
	Int3 i3=(Int3)one; //Upcasting for Int3
	i3.m1(); //Same Implementation Given For All Abstract()'s
	
	//Same O/P For Everything
	}
}
