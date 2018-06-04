package by.htp.proj.entity;

public class Student extends Person{
	
	private double avgMark;
	
	
	public Student(){
		super("Igor");
		
		//super();
		System.out.println("Student()");
	}
	
	public Student(String name, double avgMark){
		this();
		System.out.println("Student(String name, double)");
		this.avgMark = avgMark;
		
	}
	

	@Override
	public String toString() {
		
		String s = "name: " + name 
				+ " avg: " + avgMark;
		
		return s;
	}
	
	
	
	

}
