package Oops.Interface;
//INTERFACE <--- Child3 & PARENT Class <--- Child3

interface INTERF1
{
	public void m1();
}

class Parent_Class
{
	public void m1()
	{
		System.out.println("m1() in Parent Class");
	}
}

public class Child3 extends Parent_Class implements INTERF1
{
	public void m1()
	{
		System.out.println("m1() is Overriden By Child Class");
	}
	
	public static void main(String[] args) 
	{
		Child3 c=new Child3(); //Creating Object for Child Class
		c.m1();
		
		Parent_Class p=c;//Upcasting To Access Parent_Class m1()
		p.m1(); //Parent Class Non Static m1() is Overriden by Child Class
		
		INTERF1 i=c;//Upcasting To Access Interface m1()
		i.m1(); //Child Class Overriden m1() Giving Implementation for Abstract m1() in Interface
	}
}
