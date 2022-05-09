package fr.dawan.exception_.exception_personnalisee;

public class Parking {
	
	private Voiture tabVoiture[] = new Voiture[5];
	//private int[] tab = new int[5];
	
	//Compte le nombre voiture 
	private int compteur;
	
	/*
	 * throw : Permet de lever une exception manuellement 
	 * en instanciant un objet de type Exception 
	 * 
	 * throws : Ce mot clé permet de signaler à la JVM 
	 * qu'un morceau de code, une méthode, une classe... est 
	 * potentiellement dangereux
	 * et qu'il faut utiliser un try{...}catch{...}
	 */
	public void garerVoiture(Voiture voiture) throws ParkingPleinException{
		if(compteur < 5) {
			tabVoiture[compteur] = voiture;
			compteur++;
		} else {
			throw new ParkingPleinException();
		}
	}
	
}
