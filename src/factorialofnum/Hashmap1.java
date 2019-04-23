package factorialofnum;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm =new HashMap<>();
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		hm.put(4,"E");
		hm.put(5,"F");
		for(Integer i:hm.keySet())
		{
			System.out.println("key " + i + " value " + hm.get(i));
		}
		

	}

}
