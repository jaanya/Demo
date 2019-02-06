package practice1;

/* public class SuperConstructor extends SuperC

{
	
 // parent class is empty and in that default constructor will call that does not contain any body

	

 * -------	
 * SuperConstructor()
	
	{
		
		super();
		
		System.out.println("child class");
		
	}
	------
	
	

 * --------	
 * SuperConstructor()
	
	{
		
		super(10);

		
		
		System.out.println(" child class");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SuperConstructor();
		

	}
	------

	
	
	
	
	
	
	
	

	--------------
SuperConstructor()

{
	//Super() compiler generated code in case we don't define super() method here to call the constructor of parent class
	
System.out.println("Child class Constructor without paramter");	

	
}
	
SuperConstructor(int a)	
	
{
	//Super() compiler generated code in case we don't define super() method here to call the constructor of parent class
	System.out.println("Child class Contructor with paramter");
	
}
----------	

	
	//SuperConstructor
	
	//{
		
		//super();
	//}
	
	{
		System.out.println(" Child class ins block");
	}
	public static void main(String[] args)
	
	
	{
		new SuperConstructor();//a child class default constructor will call and that also by default call Super(), by this a constructor of parent class will call
		//new SuperConstructor(100);
		
		
		
	}
	
	
	
}*/



public class SuperConstructor extends SuperC



{
	
	{
	System.out.println("Child class instance block");
	}

SuperConstructor()
{
	
	System.out.println("Child class constructor ");
	
}


static void stmethod()
{
	
	System.out.println("child static block");
	
}


public static void main(String[] args)
{
	
	
	
	//new SuperConstructor();
	
	SuperConstructor.stmethod();
	
	
	
}



}













