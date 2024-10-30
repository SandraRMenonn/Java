package assignments;

import java.io.Console;

public class BasicPay {
	
	Console c=System.console();
	
	public String BasicPayAmount() {
		System.out.println("Enter the basic Pay: ");
		String a=c.readLine();
		return a;
		 }
	
	public String DeductionAmount() {
		System.out.println("Enter deduction: ");
		String a=c.readLine();
		return a;
	}
		
	public String BonusAmount() {
		System.out.println("Enter bonus: ");
		String a=c.readLine();
		return a;
	}
	
}
