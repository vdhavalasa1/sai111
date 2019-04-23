package factorialofnum;

public class FUCK {

	public static void main(String[] args) {
		String s= "SATHYASAI";
		int count=0;
		
		for(int i=0;i<s.length();i++){
			
		for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)== s.charAt(j))
					count++;
			}
			System.out.println(s.charAt(i)+""+count);
			String e= s.valueOf(s.charAt(i)).trim();
			s=s.replace(e,"");
			count=0;
		}
	}
	
	
	
	
	
}