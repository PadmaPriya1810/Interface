package Oops.Interface;

//INTERFACE <---- Child2 & PARENT Class <---- Child2

interface IF1
{
	public void m1(); //abstract m1() in Interface
}

class Parent1
{
	public void m1()
	{
		System.out.println("Parent Class m1"); //Parent Class Non Static m1()
	}
}
public class Child2 extends Parent1 implements IF1
{
	//Parent Class Non Static m1() INHERITED here
	//INTERFACE Assuming that Parent Class Non Static m1() as IMPLEMENTATION for its Abstract()
	public static void main(String[] args) 
	{
	Child2 c2=new Child2(); //Creating Object for Child
	c2.m1();
	
	Parent1 p1=c2;//Upcasting For Parent Class to access m1()
	p1.m1();
	
	IF1 i1=c2;//Upcasting For Interface to access m1()
	i1.m1();
	}
}
