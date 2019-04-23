
public class Test2 {

	public static void main(String[] args) {
		Test2 abc= new Test2();
		int[] a1={10,20,30};
		
		try{
			
			int a=30,b;
			b = 30/0;
		}
			catch(ArithmeticException f){
				System.out.println("Arthimetic exception");
			}	
			
		try{
			abc=null;
			abc.toString();
		}
			catch(NullPointerException e){
				System.out.println("Nullpointerexception");
			}
		try{
			int[] a= {1,2,3,4,5};
			System.out.println(a[6]);
		}
			catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
			}
		
	
	}

}
