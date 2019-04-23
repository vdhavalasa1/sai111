package factorialofnum;

import java.util.Scanner;

public class Printnos1210 {

	public static void main(String[] args) {
		for(int a=1,b=10,c=11,d=20,e=21,f=30;a<=10;a++,b--,c++,d--,e++,f--)
		{
			System.out.println(a +" "+b+" "+c+" "+d+" "+e+" "+f);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Rows ");
		int rows = sc.nextInt();
		System.out.print("Cols ");
		int Cols = sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=Cols;j++)
			{
				System.out.print("B");
			}
			System.out.println();
		}
	}

}
