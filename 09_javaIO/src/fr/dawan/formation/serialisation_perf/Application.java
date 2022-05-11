package fr.dawan.formation.serialisation_perf;

public class Application {

	public static void main(String[] args) {
		Produit p = new Produit(1, "Ordinateur", 500.0);
		TestSerialisation.toBin(p, "c:/tempData1/produit.txt");
		
		Produit p1 = null;
		p1 = TestSerialisation.fromBin("c:/tempData1/produit.txt");
		System.out.println(p1);
	}

}
