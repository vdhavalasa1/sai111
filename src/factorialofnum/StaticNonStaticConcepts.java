package factorialofnum;

public class StaticNonStaticConcepts {
	int i =10;
	static String name ="sai";
	
	public static void sum()
	{
		System.out.println("this is static");
	}
	public void sum(int j){
		System.out.println("this is non static " +j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(name);
         System.out.println(StaticNonStaticConcepts.name);
         StaticNonStaticConcepts.sum();
         
         
         
	}
	

}
