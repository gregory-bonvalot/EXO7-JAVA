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
