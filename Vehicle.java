package package_automobile;

public abstract class Vehicle  {
	private String brand;
	private int kilometers;
	
	public Vehicle() {
	}
	public Vehicle(String brand, int kilometers) {
		super();
		this.brand = brand;
		this.kilometers = kilometers;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getKilometers() {
		return kilometers;
	}
	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	//Ajoute dans Vehicle la méthode abstraite public String doStuff()
	public abstract String doStuff(String brand);
}
