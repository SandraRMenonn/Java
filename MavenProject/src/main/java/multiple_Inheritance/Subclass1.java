package multiple_Inheritance;

public class Subclass1 implements Interface1, Interface2 {
	
	public void MyName() {
		System.out.println("My name is "+Name);
		
	}
	
	public  void age() {
		System.out.println("My age is "+age);
	}	
	
	public static void main (String[] args) {
		Subclass1 obj=new Subclass1();
		obj.MyName();
		obj.age();
		
		
	}

}
