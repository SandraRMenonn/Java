package encapsulation;

public class Employee {
	
	private String EmpName;
	private long AccountNo;
	private String mailID;
	
	
	//Right click on above variable > SOurce > Generate getters and setters. It will be created for each variable
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public long getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}
	public String getMailID() {
		return mailID;
	}
	public void setMailID(String mailID) {
		this.mailID = mailID;
	}
	
	
}
