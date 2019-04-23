package sampa2;

public class HSBCbank implements USBank,Brazilbank {
	
	public void credit()
	{
		System.out.println("hsbc ---- bank1");
	};
	public void debit() 
		{
		System.out.println("hsbc ----- debit");
	}
	public void transfer()
	{
		System.out.println("hsbc ---- transfer");
	}
	public void carloan(){
		System.out.println("hscbc ---- car loan");
	}
	public void schoolloan(){
		System.out.println("hsbc ---- bank");
	}
}
