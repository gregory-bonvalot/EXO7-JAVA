package package_automobile;

public class Boat extends Vehicle {
	
	//Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff()
	public String doStuff(String marque) {
		return "je suis " + marque + " et je fais glou glou !";
	}
// "Je suis {brand} et je fais glou glou !"
}

package package_automobile;

//import wilderPackage.Wilder;

public class Car extends Vehicle {
	//Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff()
	public String doStuff(String marque) {
		return "je suis " + marque + " et je fais vroum vroum !";
	}
	
	// Vehicle vroum = new Vehicle("greg");   
	//System.out.println(doStuff());
//"Je suis {brand} et je fais vroum vroum !"
}

package package_automobile;

public class Hangar {
	//Crée une classe Hangar qui possédera une méthode main()
	public static void main(String[] args) {
		//Ajoute des références vers des instances des classes Car et Boat dans la méthode main() de Hangar
		// * Vehicle classe abstraite, Car et Boat classes régulières
		Vehicle vroum = new Car();
		Vehicle glou = new Boat();
		//Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()
		System.out.println(vroum.doStuff("Audi"));
		System.out.println(glou.doStuff("Beneteau"));
	}
}

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
