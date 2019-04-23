package factorialofnum;

public class ArmstrongNum {

	//153= 1*1*1+5*5*5+3*3*3
	public static void isArmStrongNum(int num)
	{
		int cube=0;
		int r;
		int temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
			if(cube==temp)
			
				System.out.println("is Armstrongnumber");
			else
				System.out.println("Not an armstrong number");
		}
	
	public static void main(String[] args) {
	isArmStrongNum(153);	
	}
}






