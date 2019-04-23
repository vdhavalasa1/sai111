package factorialofnum;

public class Finallyconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division();
	}
	public static void division(){
		int i=10;
		try{
			
			System.out.println("try block");
			int k = i/0; //infinity
			
		}
		catch(ArithmeticException e)
		{System.out.println("catch block");
	}
finally{
	System.out.println("final block");
}
}}
