package practice1;

public class InterExt implements InterfA

{

	
	public void m1()
	
	{
		System.out.println("M1 method");
		
	}
	
public 	void m2()
	
	{
		
		System.out.println("m2 method");
	}
	
	
public	void m3()
	
	{
		
		System.out.println("m3 method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterExt t=new InterExt();
		
		t.m1();
		t.m2();
		t.m3();
		
		InterfA Int= new InterExt();
		
		Int.m1();
		Int.m2();
		Int.m3();
		
		
		
	}
	

}
