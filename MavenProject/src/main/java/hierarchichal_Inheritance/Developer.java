package hierarchichal_Inheritance;

public class Developer extends Employer {
	
	public void Developer(String name) {
		System.out.println(name+" is a Developer");
	}

	public static void main(String[] args) {
		Developer obj=new Developer();
		obj.Employer("Cognizant");
		obj.Developer("Shreya");
		

	}

}
