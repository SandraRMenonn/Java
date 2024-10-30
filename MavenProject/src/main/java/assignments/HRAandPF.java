package assignments;

public class HRAandPF extends BasicPay {
	//HRAandPF obj=new HRAandPF(); //should create object in main method
	
	public double HRAAmount() {
		//float x=Float.parseFloat(obj.BasicPayAmount());
		float x=Float.parseFloat(super.BasicPayAmount()); //Super is used to refer the objects of immediate Parent class
		double HRA=x*0.05f;
		return HRA;
		//System.out.println(HRA);
		
		
	}
	public double PFAmount() {
		//float d=Float.parseFloat(obj.BasicPayAmount());
		float d=Float.parseFloat(super.BasicPayAmount());
		double PF=d*0.2f;
		return PF;
		//System.out.println(PF);
	
		
	}

}
