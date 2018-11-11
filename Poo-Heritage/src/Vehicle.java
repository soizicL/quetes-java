
public abstract class Vehicle {

	//Attributs
	
	private String brand;
	private int kilometers;
	
	//constructeurs
	public Vehicle (String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = 0;
	}

	//Getters
	public String getBrand() {
		return brand;
	}
	
	public int getKilometers() {
		return kilometers;
	}
	
	//Setters
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	//méthodes
	public abstract String doStuff();
	
}
