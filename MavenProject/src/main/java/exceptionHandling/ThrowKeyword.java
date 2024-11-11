package exceptionHandling;

public class ThrowKeyword {
	
	public void Numbers(int a, int b) {
		
		int Sum=a+b;
		System.out.println(Sum);
		
		if(Sum>50) {
			throw new ArithmeticException("Sum is greater than 50");
			}
		else{
			System.out.println("Sum is less than 50");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ThrowKeyword obj=new ThrowKeyword();
	
	try {
	obj.Numbers(60, 1);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception handled when Sum greater than 50");
	}
	System.out.println("Rest of the code");
	}

}
