package Oops.Interface;
//INTERFACE1 <--- Child & INTERFACE2 <--- Child 

//STATIC METHODS Cannot Be INHERITED

interface In1 
{
public static void m1()
{
	System.out.println("Static m1 from Interface1 ");
}
}

interface In2
{
	public static void m1()
	{
		System.out.println("Static m1 from Interface2 ");
	}
}

public class Child //implements In1,In2
{
	public static void m1()
	{
		System.out.println("Static m1 from Child");
	}
	public void m2()
	{
		System.out.println("Non-Static From Child");
	}
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.m2(); //Using Ref.Var of Child Class Can Access Child Class Non-Static m1()
		Child.m1(); //Using ClassName Can Access Child Class Static m1()
		In1.m1();//Using Interface1 Name Can Access Interface Static m1()
		In2.m1();//Using Interface2 Name Can Access Interface Static m1()
	}
}