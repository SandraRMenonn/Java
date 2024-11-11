package interfaceKeyword;

public class StudentDetails implements StudentName  {
	
	public void studentName() {
	System.out.println(name);
	}
	
	public void studentGrade() {
		System.out.println("Grade 11");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StudentName obj=new StudentDetails(); //upcasting
	StudentDetails obj1=new StudentDetails();//to call child class method we should create obj for child class
	obj1.studentName();
	obj1.studentGrade();
	
	 // we can call parent/child class methods with obj1 itself, but for interface upcasting is the syntax

}}

/*
 *  1.Let‟s first create the superclass Employee and define a method called calculateSalary() as an 
 abstract method. The Contractor class inherits all properties from its parent Employee but have to 
 provide its own implementation of calculateSalary() method and multiply the value of payment 
 per hour with given working hours. The FullTimeEmployee also has its own implementation of 
 calculateSalary()method. In this case we just multiply by constant 8 hours. 	
 
 2. Write a program, where RBI will be an interface, have a method recurringDeposit which can 
 accept the amount and duration. This must be implemented in class HDFC. 
  When a customer deposit amount in HDFC, they must be able to know how much 
 amount they will get after depositing for n period of time. 
  Interest rate is defined in RBI interface
 
 */
