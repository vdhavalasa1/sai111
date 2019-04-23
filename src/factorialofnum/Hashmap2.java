package factorialofnum;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap2 {
	String ename;
	int age;
	int height;
	Hashmap2(String ename,int age,int height){
		this.ename=ename;
		this.age=age;
		this.height=height;
	}
	public static void main(String[] args) {
		Hashmap2 hm1 = new Hashmap2("Sai1",5,4);
		Hashmap2 hm2 = new Hashmap2("Sai2",5,4);
		Hashmap2 hm3 = new Hashmap2("Sai3",5,4);
		
		HashMap<Integer,Hashmap2> hmemp = new HashMap<Integer, Hashmap2>();
		hmemp.put(1, hm1);
		hmemp.put(2, hm2);
		hmemp.put(3, hm3);
		for(Entry<Integer,Hashmap2>m:hmemp.entrySet()){
			int key=m.getKey();
			Hashmap2 e = m.getValue();
			System.out.println(key);
			System.out.println(e.ename + " " + e.age + " " + e.height);
			
		}
			
	}

}
