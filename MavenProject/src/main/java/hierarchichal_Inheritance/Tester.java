package hierarchichal_Inheritance;

public class Tester extends Employer {
	
	public void Tester(String name) {
		System.out.println(name+" is a Tester");
	}

	public static void main(String[] args) {
		Tester obj=new Tester();
		obj.Employer("Cognizant");
		obj.Tester("Sandra");
		
		//If we want to run both the child methods in single class, we can create an object for another child class and call methods of it.
		//We cannot call 'Developer' methods using obj. SHould need its own object.
		Developer obj1=new Developer();
		obj1.Employer("Cognizant");
		obj1.Developer("Shreya");

	}

}
