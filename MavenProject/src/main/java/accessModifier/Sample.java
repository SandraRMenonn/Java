package accessModifier;

public class Sample {
	
	protected int a=10; 
	//Public-to make it public prefix with public access modifier. Can access from anywhere
	//Private- Give private to make it available only within the class
	//Default- If no access modifier is given it considered will be default. this will work within the class and Package not outside that even if we extend it.
	//Protected- this will work within the class and Package not outside that. But to get outside package, if 'extends'  the required class in child class, we can access these method and variable.
	
	protected void addition() {
		int x=a+5;
		System.out.println(x+a);
		
	}

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.addition();

	}

}
