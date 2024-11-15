package collection;

import java.util.ArrayList;

public class ArrayListClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> L4=new ArrayList<Integer>(); //For primitive datatype should give full name i.e Integer for int
		L4.add(2);
		L4.add(4);
		L4.add(6);
		L4.add(8);
		
		L4.set(1, 3);
		System.out.println(L4);
		
		System.out.println(L4.get(1));
					
		System.out.println("for loop");
		for(int i=0; i<L4.size();i++) {
			System.out.println(L4);
			}
	
		System.out.println("for-each loop");
		for(int i:L4) { 
			System.out.println(i); }
		
		
			
		ArrayList <Character> L5=new ArrayList<Character>();
		L5.add('a');
		L5.add('b');
		L5.add('c');
		L5.add('d');
		L5.add('e');
		
					
		System.out.println("for loop");
		for(int i=0; i<L5.size();i++) {
			System.out.println(L5.get(i));
			}
	
		System.out.println("for-each loop");
		for(int i:L5) { 
			System.out.println(i); }	}

}
