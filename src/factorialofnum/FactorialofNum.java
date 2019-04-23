package factorialofnum;

public class FactorialofNum {
	static int fact1=1;
	public static int factorial( int num){
		for(int i=1;i<=num;i++)
			fact1=fact1*i;
		    return fact1;
			
	}
	 public static int fact=1, result=0;
	public static int fact(int num)
	{
		if (num==1)
			return 1;
		else
			result=num*fact(num-1);
			return result;
	}
 public static void main(String[] args) {
	System.out.println(factorial(4));
	System.out.println(fact(7));
}
}

 //3! = 3*2*1 = 6