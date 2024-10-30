package superKeyword;

public class Colours2 extends Colours1 {
	String color1="Green";
	String color2="Purple";
	String color3="Orange";
	
	public void AllColors() {
		super.AllColors(); //this will call 'AllColors method from immediate Parent. Using super coz Parent and child has same method name
		System.out.println(super.color1); //Using super coz Parent and child has same Variable name
		System.out.println("Secondry Colors are "+color1+color2+color3);
	}
	public Colours2(boolean runconstructor){
		super(); //Using super coz Parent and child has same constructor name. Also it should be in first line. Constructor can be called in constructor only
		if (runconstructor){
		System.out.println("Child class constructor");
		}
	}
	public Colours2(String txt){
		super("Parent class Parameterized constructor"); /*Using super coz Parent and child has same constructor name.this/super keywords for Constructors should be called in first line itself.
											Thus using Parent class constructors in two different constructors in child class */
		System.out.println(txt);
		
	}

	public static void main(String[] args) {
		Colours2 obj=new Colours2(false); //Created as boolean, otherwise when we create the object itself default constructor will be executed. But since super.constructor should be used as first line, it will run first and the rest will run only when true.
		obj.AllColors();
		System.out.println(obj.color1);/*when parent and child has same method/variable/constructor, 
		if we call any of those with child's object, then it will run only child class's method/variable/constructor */
		
		//Cannot use super keyword in main method as its static method. So should call it in child class's instance method and call instance method in main method
		
		Colours2 obj1=new Colours2(true);
		Colours2 obj2=new Colours2("Child class Parameterized constructor");
			
	}
}
