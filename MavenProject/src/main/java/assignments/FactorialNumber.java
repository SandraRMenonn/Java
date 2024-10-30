package assignments;

public class FactorialNumber {
	
	int result=1;
	public int factorial(int number) {
		
		for(int i=1;i<=number;i++){
		result=result*i;
		}
		return result;
		}
	public void PrintFactorial() {
		this.factorial(4);
		System.out.println("Factorial is "+result);
	}
	
	public static void main(String[] args) {
		
		FactorialNumber obj=new FactorialNumber();
		obj.PrintFactorial();

	}

}
