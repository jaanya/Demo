package practice1;

import java.util.ArrayList;
import java.util.Iterator;

class Student

{
	
	
	int roll;
	String name;
}




public class Listdemo {


	
	public static void main(String[] args) {
		
		// list can store only string objects
		
		ArrayList <String> list1 = new ArrayList<String>(); // specific type
		 
		
		// list can store any kind of object
		ArrayList list2 = new ArrayList();  // any type
		
		
		Student s1=new Student();
		
		s1.roll = 1008;
		s1.name="Jaanya";
		
		
		
		
		// 1. Add data in the list
		list1.add("john");
		list1.add("James");
		list1.add("Jim");
		list1.add("Jimmy");
		list1.add("Jolly");
		//list1.add(1.1); error
		
		
		list2.add("John");
		list2.add(1);
		list2.add(1.1);
		list2.add('a');
		list2.add(s1);
		
		//shall print in the list in the way we added in a sequence
		
		
		System.out.println("List 1" + list1); // output - List 1[john, James, Jim, Jimmy, Jolly]
		
		System.out.println("List2" + list2); //Output - List2[John, 1, 1.1, a, practice1.Student@33909752]
		
		
		//2. Get the element form the list
		
		String name =list1.get(2);
		
		System.out.println("name " + name); //output - name Jim

		Object o =list2.get(3);
		
		System.out.println("name " + o); // output - name a
		
		//3. Update element in the list 
		
		list1.set(1,"Jaanya");
		
		System.out.println("After updating element List1 : " + list1); //List1 : [john, Jaanya, Jim, Jimmy, Jolly] 
		
		
		list2.set(3,'J');
		
		System.out.println("After updating element list2 : " + list2);//list2 : [John, 1, 1.1, J, practice1.Student@33909752]
		
		// 4. Remove element from the list
		
		list1.remove(3);
		System.out.println("After removal List1 : " + list1); //List1 : [john, Jaanya, Jim, Jolly]
		
		
	//	list1.clear();// remove all
		
		
		if(list1.contains("Jaanya"))
				
				{
			System.out.println("Jaanya is in the list");
			
				}
		
		
		System.out.println("--------Iterating with enhanced For loop -------");
		
		for(String str : list1)
			
		{
			
			System.out.println(str);
			
		
		}
		
		System.out.println(" ----Iterating with For loop--");
		
		
		for(int i=0;i<list1.size();i++)
			
		{
		
			System.out.println(list1.get(i));
		}
		
		
		//Use of iterator
		System.out.println("----Iterating with Iterator---");

		Iterator<String> itr = list1.iterator();

		/*System.out.println(itr.next()); //john

		System.out.println(itr.next());//Jaanya*/

      while(itr.hasNext())                  // ----Iterating with Iterator---
  	{
    	  String str = itr.next(); 
    	  System.out.println(str);
    	  									//Output
    }										//john
    	  									//Jaanya
    	  									//Jim
    	  									//Jolly
	
      					
		
     //Employee class object
		
		Employee emp=new Employee("Jaanya",3,"Student");
		Employee emp1=new Employee("Lavya",5,"Senior Student");
		Employee emp2=new Employee("Swati", 25,"Teacher");
		
		//Create Array list
		
		ArrayList<Employee> ea=new ArrayList<Employee> ();
		ea.add(emp);
		ea.add(emp1);
		ea.add(emp2);
		
		//Iterator to traverse the value
		
		Iterator<Employee> itera= ea.iterator();
		
	System.out.println("---------");	
		while(itera.hasNext())
		{
			Employee em =itera.next();
			System.out.print(em.name);
			System.out.print(" " + em.age);
			System.out.print(" " + em.dep);
			System.out.println();
			
		}
		
		ArrayList<String> st1=new ArrayList<String> ();
		
		st1.add("Lavya");
		st1.add("Jaanya");
		
		
ArrayList<String> st2=new ArrayList<String> ();
		
		st2.add("Vikrant");
		st2.add("Luthra");
		
				st1.addAll(st2);
				
	for(String str : st1)
		
	{
		System.out.println(str);
	}
				
	
	st1.removeAll(st2);
	
	System.out.println("-----Remove----");
	
	
	for(String str : st1)
		
		{
			System.out.println(str); //Lavya
									//	Jaanya
		}
	
				

		//retainAll
	
	
	
	
	
	ArrayList<String> t1=new ArrayList<String> ();
	
	t1.add("John");
	
	t1.add("Mike");
	
	
ArrayList<String> t2=new ArrayList<String> ();
	
	t2.add("John");
	
	t2.add("Hike");
	
	
	
	t1.retainAll(t2);
	
	
	System.out.println("Retain All -->");
	
	for(int i=0;i<t1.size();i++)
		
	{
		
		System.out.println(t1.get(i)); //John
		
	}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
