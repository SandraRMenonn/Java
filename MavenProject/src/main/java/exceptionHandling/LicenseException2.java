package exceptionHandling;

public class LicenseException2 {
	
	public void display(int age) throws LicenseException {
		if (age>18) {
			System.out.println("Eligible for License");
		}
		else {
			throw new LicenseException("Age is less than 18");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LicenseException2 obj=new LicenseException2();
		
		try {
			obj.display(12);
		}
		catch (LicenseException e){
			//e.printStackTrace();
			System.out.println("exception handled since age is less than 18");
		}
		
}

}
