package factorialofnum;

public class Methodoverloading {

	public void sum(){
		System.out.println("this is a zero param");
	}
	public void sum(int i){
		System.out.println("this is one param " + i);
	}
	public void sum(int q, int k){
		System.out.println("this is a two param " + (q+k));
	}
	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);

	}

}
