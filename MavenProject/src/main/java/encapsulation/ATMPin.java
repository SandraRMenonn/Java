package encapsulation;

public class ATMPin {
	
	private int PIN;
	

	public int getPIN() {
	return PIN;
	}

	public void setPIN(int PINnumber) {
		PIN = PINnumber;
		
	}
	
	public void Validation() {
		
		if(PIN==1001 || PIN==1234 || PIN==1212) {
			System.out.println("PIN is valid");
			
			
		}
		else {
			System.out.println("PIN is  invalid");
		}
	}
	

}
