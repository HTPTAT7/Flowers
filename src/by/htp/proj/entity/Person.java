package by.htp.proj.entity;

public class Person {
	
	protected String name;
	
	public Person(String name){
		
		super();
		System.out.println("Person(String name)");
		this.name = name;
	}
	
	public Person(){
		super();
		System.out.println("Person()");
	}

}
