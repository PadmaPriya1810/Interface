package Oops.Interface;
//INTERFACE1 <--- INTERFACE2 <---- Class

//MEMBERS NOT ALLOWED
//1. Multi-Line Initializers
//2. Constructors
//3. Non-Static Concrete Methods
//4. Non-Static Variables
//5. Private Methods


//MEMBERS ALLOWED
//1. Static Concrete Methods -i.e., With Block
//2. Static Final Variables //Also Acts as Static Single Line Initializers
//3. Abstract Methods

//NOT INHERITED
//1.Static Methods

interface Intr1 //COMPILER VIEW- abstract public interface I1
{
int a=10; //COMPILER VIEW - public static final int a=10; (Acts as SLI)

public void m1(); //COMPILER VIEW - abstract public void m1();

public static void m2() //STATIC METHODS Cannot Be INHERITED in INTERFACE
{
System.out.println("From Interface I1");
}
}

interface Intr2 extends Intr1 //By Default "abstract"
{ 
	public void m3();
}

public class I2 implements Intr2
{
	//Inter1 I1=new Inter1(); //Cannot Create Object For Interface
	//Inter2 I1=new Inter2(); //Cannot Create Object For Interface
	
	public void m1()
	{
		System.out.println("m1 Implementation Given");
	}
	
	public void m3()
	{
		System.out.println("m3 Implementation Given");
	}
	public static void main(String[] args) {
	
	I2 i=new I2(); //Creating Object For Concrete Class
	i.m1(); 
	i.m3();
	
	
	
	//i.m2(); //Static Methods Are Not Inherited. So Cant Access From Child Class
	
	Intr1.m2();// By Using INTERFACE NAME, Can Access Static Methods
	
	System.out.println(Intr1.a);//Can Access Static Final Variables in Class Using Interface Name
	
	System.out.println(i.a); //Can Access Static Final Variables in Class Using Child Class Ref.Var
}
}