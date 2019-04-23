package factorialofnum;



public class Callbyvalue {

	public static void main(String[] args) {
		int x = 3;
		System.out.println("before increament" + x);//3
		increament(x);
		System.out.println("after increament" + x);//3
	}
	public static void increament(int a){
		System.out.println("before increament" + a);//3
		a=a+1;
		System.out.println("after increament" + a);//4
	}
}
