package factorialofnum;

public class Thisclass {
   private static int x;
   public void setx(int x)
   {
	   this.x=x;
   }
   public int getx(){
	   return x;
   }
   public static void show(){
	   System.out.println("the value of x is " +x);
   }
   public Thisclass(int x){
	 this.x=x;
   }
	public static void main(String[] args) {
		Thisclass tc = new Thisclass(6);
		tc.show();
		System.out.println(tc.getx());
		tc.setx(4);

	}

}
