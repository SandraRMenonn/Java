package inheritance; //Can inherit from Parent. Single inheritance.

public class TwoWheeler extends Vehicle {
	
	String type="Bike";
	String brand="Royal Enfield";
	int price=100000;
	
	public void car() {
		System.out.println("Type of TwoWheeler is "+type);
		System.out.println("Brand of "+type+" is "+brand);
		System.out.println("price of the "+type+" is "+price);
		
	}

	public static void main(String[] args) {
		
		
	TwoWheeler obj=new TwoWheeler();//Object should be created for the child class which we are executing/running. Which has main method.
	obj.vehicle();
	obj.car();
	System.out.println(obj.s);
	}

}
