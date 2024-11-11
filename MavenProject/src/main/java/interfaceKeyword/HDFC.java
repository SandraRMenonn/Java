package interfaceKeyword;

public class HDFC implements RBI {
	
	
	public void recurringDeposit(int depositAmt, int duration) {
		double interestAmtPerMonth=depositAmt*interestPercentPerMonth;
		double MaturityAmt=(interestAmtPerMonth*duration)+depositAmt;
		
		System.out.println(MaturityAmt);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI obj=new HDFC();
		obj.recurringDeposit(10000,15);
		

	}

}
