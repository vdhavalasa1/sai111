package factorialofnum;

public class Palindromenumber {
public static void isPalindromeNum(int num){
	int r=0;
	int sum=0;
	int temp;
	temp=num;
	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	if(temp==sum)
		{
		System.out.println("is palidrome");
				}
	else
		System.out.println("is not palidrome");
	}
public static void main(String[] args) {
	isPalindromeNum(121);
}
}
