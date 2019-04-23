package factorialofnum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Stringfunctions {

	//153= 1*1*1+5*5*5+3*3*3
	public static void main(String[] args) throws IOException {
 String s1="This is a long story";	
     //  0123456789101112131415
   String rev="";
	int len = s1.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+s1.charAt(i);
	}
System.out.println(rev);
	System.out.println(s1.indexOf('s'));
	System.out.println(s1.indexOf('s', s1.indexOf('s')+1));
	System.out.println(s1.indexOf('s', s1.indexOf('s', s1.indexOf('s')+1)+1));
		StringBuffer s2=new StringBuffer(s1);
	System.out.println(s2.reverse());
	}
}
