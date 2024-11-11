package abstarctKeyword;

public class FullTimeEmployee extends Employee {
	
public void calculateSalary(int PayPerHour, int WorkingHours) {
		//WorkingHours=WorkingHours+2; //Here we cannot change the value as we made WorkingHours as constant
		int TotalPay=PayPerHour*WorkingHours;
		System.out.println("Total Pay for Full Time Employee: "+TotalPay);
		
	}}
