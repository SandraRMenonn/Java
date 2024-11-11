package encapsulation;

public class PINValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATMPin obj=new ATMPin();
		obj.setPIN(1212);
		obj.Validation();
		System.out.println("PIN entered is: "+obj.getPIN());
		
		
	}

}
