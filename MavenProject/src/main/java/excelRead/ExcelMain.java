package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s=ExcelCode.readStringData(1,0);
		String s1=ExcelCode.readIntegerData(1,1);
		System.out.println("Row "+s);
		System.out.println("Col"+s1);
		
		
		
	}

}
