package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generic arraylist
				ArrayList <String> L3=new ArrayList<String>();
				L3.add("White");
				L3.add("Brown");
				L3.add("Yellow");
				L3.add("Pink");
				System.out.println(L3);
							
				//For loop
				System.out.println("for loop");
				for(int i=0; i<L3.size();i++) {
					
					System.out.println(L3.get(i));
					}
				
				//For each loop. also known as enhanced for loop.Used to iterate through collection/array
				System.out.println("for-each loop");
				for(String i:L3) { 
					
					System.out.println(i);
					}
			//Iterator is an interface, with which we can iterate through an array
			System.out.println("Iterator");
			Iterator<String> IT=L3.iterator();
			while (IT.hasNext()) {  //hasnext is a method of iterator interface. It check whether it has an element, if yes 'while' will be true
				System.out.println(IT.next()); //Returns the next specified element during the iteration.
			}
			
			System.out.println("Iterator-Remove");
			IT.remove(); //to remove last element of an arraylist
			System.out.println(L3);
	}

}
