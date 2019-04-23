import factorialofnum.Arrays;

//5 :  Write a Java program to sort an array of given integers using CountingSort Algorithm
public class Test5 {
public static void countsort(int[]input, int k){
	int count[]= new int[k+1];
	for(int i:input){
		count[i]++;
		}
	int a = 0;
	for(int i=0;i<count.length;i++)
	{
		while(0<count[i])
		{
			input[a++]=i;
			count[i]--;
		}
	}
}

	public static void main(String[] args) {
	
		int[] abc = {10,7,12,4,9,13,16};
		int k = 16;
		System.out.println(java.util.Arrays.toString(abc));
		countsort(abc , k);
		System.out.println(java.util.Arrays.toString(abc));
	}

	}


