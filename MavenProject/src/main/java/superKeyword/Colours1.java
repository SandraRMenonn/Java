package superKeyword;

public class Colours1 {
	String color1="Red";
	String color2="Yellow";
	String color3="Blue";
	
	public void AllColors() {
		System.out.println("Primary Colors are "+color1+color2+color3);
	}
	
	public Colours1() {
		System.out.println("Parent class constructor");
	}
	public Colours1(String txt) {
		System.out.println(txt);
	}

}
