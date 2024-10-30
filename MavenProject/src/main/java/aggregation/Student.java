package aggregation;

public class Student {
	
	String name;
	int age;
	
	Address adr; //reference variable to access Address class. Creating a Has-A relationship
	
	public Student(String name, int age, Address adr) {
		this.name=name;
		this.age=age;
		this.adr=adr;
		
	}
	
	public void Display() {
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student address: "+adr.HouseName+", "+adr.PostOffice+", "+adr.District+", "+adr.Pin);
	}

	public static void main(String[] args) {
		Address obj=new Address("10A","Vandazhy","Palakkad",667667); //Creating object for Address to pass arguments
		Student obj1=new Student("Sandra",30,obj);
		
		obj1.Display();

	}

}
