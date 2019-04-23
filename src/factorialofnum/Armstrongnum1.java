package factorialofnum;

public class Armstrongnum1 {
	//153 = 1*1*1+125+27=153
	public static void armstrong(int num){
		int r;
		int sum=0;
		int temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("armstrong num");
		}
		else
			System.out.println("not an armstrong num");
	}

	public static void main(String[] args) {
		armstrong(152);

	}

}
