package factorialofnum;

public class ReadfromArray {

	public static void main(String[] args) {
		int p[][]={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		//int q []={1,2,3};
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[0].length;j++)
			{
				System.out.print(p[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
	}
