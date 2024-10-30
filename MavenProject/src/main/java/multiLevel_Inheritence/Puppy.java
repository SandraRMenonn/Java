package multiLevel_Inheritence; //Can inherit from Parent and Parent's Parent. MultiLevel inheritance.

public class Puppy extends Dog {

	String puppyName="Brownie";
	
	public void puppyDetails() {
		System.out.println("Puppy's name is "+puppyName);
	}
	
	
	public static void main(String[] args) {
	Puppy obj=new Puppy();//Object should be created for the child class which we are executing/running. Which has main method.
	obj.animal();
	obj.animalName();	
	System.out.println("Chikku has a puppy.");
	obj.puppyDetails();
	

	}

}
