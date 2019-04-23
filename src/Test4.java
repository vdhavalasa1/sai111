import java.util.HashSet;

//Write a program to convert hashset into array

public class Test4 {

	public static void main(String[] args) {
	HashSet<String> h = new HashSet<String>();
	h.add("SAI");
	h.add("Green");
	System.out.println("Hash set is" + h);
	String[] array1 = new String[h.size()];
	h.toArray(array1);
	for(String s : array1)
		System.out.println(s);
	

	}

}
