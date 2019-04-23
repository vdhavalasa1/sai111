package factorialofnum;

public class Swaptwostringswithouttemp {

	public static void main(String[] args) {
		String a ="HELLO1";
		String b = "SAI1";
		String[] str =null;
				a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);

	}

}
