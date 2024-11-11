package exceptionHandling;

import java.io.IOException;

public class CheckedThrows {
	
	public static void Sample() throws IOException{// Should give throws for checked
		throw new IOException();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Sample();
			}
		catch(IOException e) {
			System.out.println("Throws for Checked Exceptions");
		}

	}

}
