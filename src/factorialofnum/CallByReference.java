package factorialofnum;

public class CallByReference {
 int p;
 int q;
	public static void main(String[] args) {
		CallByReference obj1 = new CallByReference();
		obj1.p=50;
		obj1.q=60;
		System.out.println(obj1.p);
		System.out.println(obj1.q);
		swap(obj1);
		System.out.println(obj1.p);
		System.out.println(obj1.q);

	}
      public static void swap(CallByReference t){
    	  int temp;
    	  temp=t.p;
    	  t.p=t.q;
    	  t.q=temp;
      }
}
