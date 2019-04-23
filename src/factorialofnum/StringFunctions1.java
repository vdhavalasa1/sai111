package factorialofnum;

public class StringFunctions1 {

	public static void main(String[] args) {
	 String s1= "SAI_RAM_SAI";
	 String s2 = "RAM";
	String[] s3 = s1.split("_");
	for(int i=0;i<s3.length;i++){
		System.out.println(s3[i]);
	}
	System.out.println();
	 
	  s1=s1+s2;
	  s2=s1.substring(0,s1.length()-s2.length());
	  s1=s1.substring(s2.length());
	  System.out.println(s1);
	  System.out.println(s2);
	 
	 /*StringBuffer s1= new StringBuffer(s);
	  System.out.println(s1.reverse());
	  if( s1.equals(s1.reverse()))
		{
		System.out.println("is  palinrome");
		}
	  */

	}

}
