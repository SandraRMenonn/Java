package polyMorphism;

public class ChildClass extends ParentClass {
	
	public void addition(int c, int d) {
		int x=c+d;
		System.out.println("Child class Sum= "+x);
		super.addition(12, 10);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj=new ChildClass();
		obj.addition(20, 11); // in this way should call parent method with super keyword in child's method
		
		
		/*Upcasting. Creating a ref variable of parentclass and using that. 
		Either of above or below ways can be used to call methods of same name. In the below way we can call parent class or child class methods directly */
		
	/*	ParentClass obj1=new ChildClass();  creating ref variable of Parent class
		obj1.addition(12, 5);
		
		OR 
		
		ParentClass b; creating ref variable of Parent class
		b=new ChildClass();
		b.addition(10, 12);
		b=new ParentClass();
		b.addition(5,2);
		
	*/	

	}

}
