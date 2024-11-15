package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generic. Have to specify the datatype
	Set <String> S1=new HashSet(); //Set is an interface
		
	S1.add("a");
	S1.add("b");
	S1.add("c");
	S1.add("d");
	System.out.println(S1);
	
	HashSet H1=new HashSet();
	
	H1.add(1);
	H1.add(2);
	H1.add(3);
	H1.add(4);
	System.out.println(H1);
	
	HashSet <String> H2=new HashSet<String>();
	
	H2.add("e");
	H2.add("f");
	H2.add("g");
	H2.add("h");
	System.out.println(H2);
	
	System.out.println(S1.isEmpty());
	System.out.println(S1.size()); 
	System.out.println(S1.contains("Brown")); 
	//S1.remove(0); will not work for Set as it is not an Array thus no Index
	S1.remove("d");
	System.out.println(S1);
	
	S1.addAll(H1); 
	System.out.println(S1);
	
	S1.removeAll(H1); 
	System.out.println(S1);
	
	 
	
	//Below will not work for Set as it is not an Array thus no Index
	
	/* S1.set(1, 3);
	System.out.println(S1);
	
	System.out.println(S1.get(1));
	System.out.println(S1.get(3));
	
	Collections.sort(S1);
	System.out.println(S1); */
	
	
	System.out.println("Iterator");
	Iterator<String> IT=S1.iterator();
	while (IT.hasNext()) {  //hasnext is a method of iterator interface. It check whether it has an element, if yes 'while' will be true
		System.out.println(IT.next()); //Returns the next specified element during the iteration.
	}
	
	System.out.println("Iterator-Remove");
	IT.remove(); //to remove last element of an arraylist
	System.out.println(S1);

	}

}
