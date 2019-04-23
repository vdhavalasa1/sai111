package factorialofnum;

import java.util.*;

public class ArrayList {
	
	public static void main(String[] args) {
	
		java.util.ArrayList<String> ar1= new java.util.ArrayList<String>();
		ar1.add("Java");
		ar1.add("Javascript");
		ar1.add("C");
		
		
		java.util.ArrayList<String> ar2= new java.util.ArrayList<String>();
		ar2.add("Java1");
		ar2.add("phyton");
		//ar1.addAll(ar2);
		ar1.removeAll(ar2);
		//ar1.retainAll(ar2);
		for(int i =0;i<ar1.size();i++){
			System.out.println(ar1.get(i));
		
		}
		
				
	}

}
