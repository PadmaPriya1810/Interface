package Oops.Interface;

interface INTERFACE1 //COMPILER VIEW- abstract public interface I1
{
int a=10; //COMPILER VIEW - static final int a=10; (Acts as SLI)

public void m1(); //COMPILER VIEW - abstract public void m1();
}

public class StaticFinalVariable_Inherited implements INTERFACE1 

{
	public void m1()
	{
		System.out.println("Class Giving Implementation for m1()");
	}
	
	public static void main(String[] args) 
	{
		StaticFinalVariable_Inherited sf=new StaticFinalVariable_Inherited();
		sf.m1(); //Implementation Given By Class for Abstract m1() in Interface
		
		System.out.println(sf.a); //Static Final Variables are INHERITED from Interface
	}
}
