
public class Boat extends Vehicle {
	
	
	
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		
	}

	@Override
	public String doStuff() {
		return "je suis " + super.getBrand()+ " et je fais glou glou !";
	}
	
}
