package fr.dawan.object_;

public class Application {

	public static void main(String[] args) {
		CompteBancaire cb1 = new CompteBancaire("toto", "12aaa541", 87455854);
		System.out.println(cb1.toString());
		
		CompteBancaire cb2 = new CompteBancaire("tata", "66tttt66", 5000);
		CompteBancaire cb3 = new CompteBancaire("tata", "66tttt66", 5000);
		
		
		//cb2 == cb3   ==> L'operateur == utilisé entre les objets compare 
		//l'adresse des references
		System.out.println(cb2 == cb3);
		
		System.out.println(cb2.equals(cb3));
	
	}

}
