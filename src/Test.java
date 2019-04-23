
public class Test {

	public static void main(String[] args) {
		int x= 0;
		String s = "INDiabbccggttttt";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i))==true)
			//if(b>=65 && b<=96)
				x = x+1;
		}
  System.out.println(x);
	}

}
