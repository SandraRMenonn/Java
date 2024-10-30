package assignments;

public class AreaOfFigures {
	
	
	
	public void area(int length, int width) {
		double areaOfRectangle=length*width;
		System.out.println("Area Of Rectangle is "+areaOfRectangle);
		
	}
	public void area(int side) {
	double	areaOfSquare=Math.pow(side, 2);
	System.out.println("Area Of Square is "+areaOfSquare);	
	}
	
	public void area(float radius) {
		float pi=3.14f;
		double areaOfCircle=pi*(Math.pow(radius, 2));
		System.out.println("Area Of Circle is "+areaOfCircle);	
	}
	

	public static void main(String[] args) {
		AreaOfFigures obj=new AreaOfFigures();
		obj.area(16, 9);
		obj.area(7);
		obj.area(7.2f);

	}

}
