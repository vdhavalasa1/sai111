package factorialofnum;

public class Primenos {

	public static boolean Isprimenumber(int num){
		if(num<=1)
			return false;
		for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					return false;
					
				}
				
			}
		return true;
	}
	public static void main(String[] args) {
		if((Isprimenumber(51))==true)
			System.out.println("given no is a prime no");
		else
			System.out.println("Given no is not a prime no");

	}

}
