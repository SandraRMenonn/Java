package abstarctKeyword;

public class Contractor extends Employee{
		
	public void calculateSalary(int PayPerHour,int WorkingHours) {
		WorkingHours=WorkingHours+2;
		int TotalPay=PayPerHour*WorkingHours;
		System.out.println("Total Pay: "+TotalPay);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contractor obj=new Contractor();
		obj.calculateSalary(200, 2);
		FullTimeEmployee obj1=new FullTimeEmployee();
		obj1.calculateSalary(600, 8);
		

	}}
