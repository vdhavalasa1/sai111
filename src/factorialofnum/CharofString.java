package factorialofnum;

public class CharofString {

	public static void main(String[] args) {
	String a = "INDIA";
	int x=0;
	for(int i=0;i<a.length();i++)
		{
		char y = a.charAt(i);
		if(y=='A')
		{
			x=x+1;
		}
		}
 System.out.println(x);
	}

}
