package finalKeyword;

public final class Class1 {
	
	final int A=10; //Final variable is also a constant. Should be in UpperCase
	
	final int B; //uninitialized final variable. Blank final variable.
	
	//b=20; //blank final variable can be initialized only inside a constructor
	
	public Class1(){
		B=20; 
		//B=30; //final variable value will be constant. cannot be changed
		
	}
	
	public final void addition() {
		int x=A+10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
