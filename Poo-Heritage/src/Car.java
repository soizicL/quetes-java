
public class Car extends Vehicle {
		
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		
	}

	//implementation du corps de la méthode DoStuff
	@Override
	public String doStuff() {
		return "je suis " + super.getBrand() + " et je fais vroum vroum";
	}
	
}
