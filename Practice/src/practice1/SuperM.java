package practice1;


class SuperM extends Super1
{
	
	void m()
	
	{
		System.out.println("child");
		
	}
		
	void m1()
	
	{
	this.m(); //optional
	super.m();
	
		
	}
	
			
	
	
	public static void main(String[] agrs)
			
	{
		
		SuperM c =new SuperM();
		
		c.m1();
		
		
	}
	
}

	
	
	
	
	

