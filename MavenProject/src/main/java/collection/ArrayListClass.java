package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generic
		List <String> L1=new ArrayList(); //ArrayList uses Dynamic array, hence there is no size limit
		L1.add("Red");
		L1.add("Blue");
		L1.add("Green");
		System.out.println(L1);
		
		//non generic, can add any datatype
		ArrayList L2=new ArrayList();
		L2.add("Black");
		L2.add("S");
		L2.add(1);
		L2.add(10.2);
		L2.add(254796112);
		System.out.println(L2);
		
		
		//generic arraylist, Have to specify the datatype. Here only String can be given
		ArrayList <String> L3=new ArrayList<String>(); //String-non primitive datatype. For primitive datatype should give full name. 
		System.out.println(L3.isEmpty());
		L3.add("White");
		L3.add("Brown");
		L3.add("Yellow");
		L3.add(null);
		L3.add("Pink");
		L3.add(null); //ArrayList allows duplicate data
		System.out.println(L3);
		System.out.println(L3.isEmpty()); //Is it empty or not?
		System.out.println(L3.size()); //its size?
		System.out.println(L3.contains("Brown")); //does it contain the given data?
		L3.remove(0); //to remove any object in array using index
		L3.remove("Brown");//to remove any object in array using object
		System.out.println(L3);
		
		Collections.sort(L1);//to Sort the data //Collections is a utility class with lots of methods //Collection is an interface
		System.out.println(L1);
		
		L1.addAll(L3); //To add one  list to another list. Can move from generic to non generic but not vice versa
		System.out.println(L1);
		
		L1.removeAll(L3); //to remove added list
		System.out.println(L1);
		
		System.out.println(L2.get(4)); //get any value with index
		
	}

}
