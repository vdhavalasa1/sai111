package factorialofnum;
public class sample1{
	public static void main(String args[])
	{
		
	    String s="BABY";
	    int distinct = 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        }   
	        System.out.println(s.charAt(i)+"--"+distinct);
	       String d=s.valueOf(s.charAt(i)).trim();
	       s=s.replaceAll(d,"");
	        distinct = 0;

	    }

	}
}
