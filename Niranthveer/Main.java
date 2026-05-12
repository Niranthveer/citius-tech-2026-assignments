package com.citiustech;

public class Main {
	public static void SalRaiser(Employee e)
	{
		e.raiseSalary();
	}
	
	public static void main(String[] args)
	{
		Programmer p1 = new Programmer(1,"ABC",100000);
		Programmer p2 = new Programmer(2,"DEF",120000);
		
		Admin a1 = new Admin(3,"GHI",110000);
		Admin a2 = new Admin(4,"JKL",150000);
		
		Manager m1 = new Manager(5,"MNO",150000);
		Manager m2 = new Manager(6,"PQR",180000);
		
		System.out.println("Before raise : ");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("_______________________");
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("_______________________");
		
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println("_______________________");
		
		
		
		SalRaiser(p1);
		SalRaiser(p2);
		SalRaiser(m1);
		SalRaiser(m2);
		SalRaiser(a1);
		SalRaiser(a2);
		
		System.out.println("__________________________________________________");
		System.out.println("__________________________________________________");
		
		
		
		System.out.println("After raise :");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("_______________________");
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("_______________________");
		
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println("_______________________");
		
		
	}

}




//Manager.java

/*
 * 
 * 
 * package com.citiustech;

public class Manager extends Employee {
	public Manager(int id , String name , double salary)
	{
		super(id,name,salary);
	}
	@Override
	public void raiseSalary()
	{
		salary += salary*0.08;
	}
}






//Programmer.java


/*
 * 
 * package com.citiustech;

public class Programmer extends Employee {
	public Programmer(int id , String name , double salary)
	{
		super(id,name,salary);
	}
	@Override
	public void raiseSalary()
	{
		salary += salary*0.1;
	}

}
