package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String S=ExcelCode.readStringData(0,0);
		String S1=ExcelCode.readIntegerData(0,1);
		System.out.println("Row"+S);
		System.out.println("Col"+S1);
		
		
		
	}

}
