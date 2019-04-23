package factorialofnum;

public class ReverseaString {

	public static void main(String[] args) {
		String s1="MADAM";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s2.reverse());
		System.out.println(s2.toString());
		if(s1.equals(s2.toString()))
				System.out.println("is a palinrome");
		else
			System.out.println("not a palirome");
	}

}
