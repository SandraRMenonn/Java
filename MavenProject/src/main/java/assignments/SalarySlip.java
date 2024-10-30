package assignments;

public class SalarySlip extends HRAandPF {
	

	public static void main(String[] args) {
		
	SalarySlip obj=new SalarySlip();
		float basicPay=Float.parseFloat(obj.BasicPayAmount());
		float deduction=Float.parseFloat(obj.DeductionAmount());
		float bonus=Float.parseFloat(obj.BonusAmount());
		double HRA=obj.HRAAmount();
		double PF=obj.PFAmount();
		double TotalSalary=basicPay+HRA-PF-deduction+bonus;
		
		System.out.println("Salary Slip:");
		System.out.println("Basic Pay: "+basicPay);
		System.out.println("Deduction: "+deduction);
		System.out.println("Bonus: "+bonus);
		System.out.println("HRA: "+HRA);
		System.out.println("PF: "+PF);
		System.out.println("Total salary by hand: "+TotalSalary);	

	}

}
