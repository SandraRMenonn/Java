package assignments;

public class ReverseNumber {
	
	int number=78909;
	int reverse=0;
	int lastdigit;
	
	public ReverseNumber(int number){
		
		this();
		while(number>0) {
			lastdigit=number%10;
			reverse=reverse*10+lastdigit;
			number=number/10;			
		}
		System.out.println("Digit after reversing is "+reverse);
	}
	
	public ReverseNumber() {
		
		System.out.println("Finding Reverse of "+number);
		
	}
	public static void main(String[] args) {
		
		ReverseNumber obj=new ReverseNumber(78909);
		
	}

}
