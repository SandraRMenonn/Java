package abstarctKeyword;

public class ChildClass extends ParentClass { //abstract class should be extended to implement it. otherwise abstraction will not work

	public void display() {
		System.out.println("age: 30");
	}
	
	public void nationality() {
		System.out.println("India");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass obj=new ChildClass(); //obj for child class
		obj.display();
		obj.myDetails();
		obj.nationality();
		
	}

}
