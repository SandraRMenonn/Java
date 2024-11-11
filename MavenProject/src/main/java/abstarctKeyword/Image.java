package abstarctKeyword;

public class Image extends Google {
	
	public void search(String a) {
		System.out.println(a);
		
	}
	
	public void display() {
		System.out.println("Image 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Image obj=new Image();
		Video obj1=new Video();
		obj.search("Java");
		obj.display();
		obj1.search("Maven");
		obj1.display();
		

	}

}
