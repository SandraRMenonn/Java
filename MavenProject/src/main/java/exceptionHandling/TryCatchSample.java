package exceptionHandling;

public class TryCatchSample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=0;
		int S=a+b;
		
		System.out.println("Sum= "+S);
		
		
		try {
			int arr[]=new int[4];
			arr[6]=8;
			int C=a/b;
				
			
		}
		catch (ArithmeticException e){
			System.out.println("Division by zero is not possible");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is 4");
		}
		catch(Exception e) {
			System.out.println("Parent exception");
		}
	
		finally{ //finally is a block. this will not handle the exception, Catch is required to handle anyway
			System.out.println("Exception will not be handled with finally");
			
		}
		
		System.out.println("Exception handling sample");

	}

}
