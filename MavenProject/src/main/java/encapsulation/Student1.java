package encapsulation;

public class Student1 {
	private int rollNo;
	private String name;
	private String dep;
	
	
	//manually  creating getter and setter
	public void setter(String name, int rollNo, String dep) {
		
		this.name=name;
		this.rollNo=rollNo;
		this.dep=dep;
	}
	
	public void getter() {
		System.out.println("Student name: "+name+", Roll No: "+rollNo+", Department:"+dep);
	}

}
