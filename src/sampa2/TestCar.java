package sampa2;

public class TestCar {

	public static void main(String[] args) {
		
		Bmw b = new Bmw();
		b.start();//method overriding (Static or compile time polymorphysim
				  // when same method is present in parent and child class with same name and arguments
		b.theftsafety();
		b.stop();

		Car c = new Car();
		c.stop();
		c.start();
		c.refuel();
	
	
		//top casting
		 Car c1 =new Bmw();
		 c1.start();
		
	}

}
