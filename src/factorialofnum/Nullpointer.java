package factorialofnum;

public class Nullpointer {

	public static void main(String[] args) {
	
		try{
			Nullpointer np = new Nullpointer();
			
			System.out.println("try block");
			np =null;
			np.toString();
			
		}catch(NullPointerException e)
		{
			System.out.println("cath it");
		}

	}

}
