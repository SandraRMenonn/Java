package exceptionHandling;

public class UncheckedThrows {
		
		public void Sample() throws ArithmeticException {//Not mandatory to give throws for unchecked
			throw new ArithmeticException();
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UncheckedThrows obj=new UncheckedThrows();
		try {
			obj.Sample();
			}
		catch(ArithmeticException e) {
			System.out.println("Throws for Unchecked Exceptions");
		}

	}

}
