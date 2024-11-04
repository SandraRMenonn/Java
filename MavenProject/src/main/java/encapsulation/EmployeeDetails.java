package encapsulation;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj=new Employee();  //local encapsulation. Creating object for first class
		obj.setEmpName("Sandra");
		obj.setAccountNo(125488878);
		obj.setMailID("sandrarmenon@gmail.com");//not need to call get here as get is only returning the value and not printing
		
		System.out.println("Employee name: "+obj.getEmpName());
		System.out.println("Account number: "+obj.getAccountNo());
		System.out.println("Mail Id: "+obj.getMailID());

	}

}
/*
Program to withdraw amount from an ATM
 Class 1- Bank One method to set pin from „User‟ class and
validate Pin in another method
 [Valid pins – 1001, 1234, 1212]
 Pin number should declared as private
 Class 2 – User Get the pin from User

*/