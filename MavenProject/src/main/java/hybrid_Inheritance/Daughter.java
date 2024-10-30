package hybrid_Inheritance;

public class Daughter extends Parents {
	
	public void Daughter(String name,int age) {
		System.out.println("Daughter's name is "+name+" and her age is "+age);
	}

	public static void main(String[] args) {
		
		Son obj1=new Son();
		obj1.Son("Sanjay", 34);
		obj1.Grandparents("Vimala", 76, "Chandran", 81);
		obj1.Parents("Mini", 60, "Radhakrishnan", 70);
		
		Daughter obj=new Daughter();
		obj.Daughter("Sandra", 30);
		
		

	}

}
