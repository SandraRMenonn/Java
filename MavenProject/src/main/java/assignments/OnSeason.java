package assignments;

public class OnSeason extends OffSeason {
	

	public void Discount() {
		
		double price=super.TotalPrice*0.4;
		System.out.println("Price after discount on on season: "+price);
		
		
	}
	public static void main(String[] args) {
		
	/*	OffSeason b=new OnSeason(); //In this case should call parent class method in child class method using super keyword
		b.Discount(); */
		
		OffSeason x;
		x=new OffSeason();
		x.Discount();
		x=new OnSeason();
		x.Discount();

	}

}
