package polyMorphism;

public class Hockey extends Sports {
	
	public void Sport() {
		System.out.println("Sport is Hockey");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sports x;
		x=new Sports(); //if not creating this for parent class, we can use super keyword in child class method
		x.Sport();
		x=new Cricket();
		x.Sport();
		x=new Football();
		x.Sport();
		x=new Hockey();
		x.Sport();
		
		

	}

}
