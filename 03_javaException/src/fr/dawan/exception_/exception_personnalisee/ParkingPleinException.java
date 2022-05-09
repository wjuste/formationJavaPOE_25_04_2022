package fr.dawan.exception_.exception_personnalisee;

/*
 * Pour créer ses propres exceptions 
 * 1- Heriter de la classe Exception 
 * 2- Appeler le constructeur de la classe Exception
 */
public class ParkingPleinException extends Exception{

	public ParkingPleinException() {
		super("Il n'y a plus de places sur le parking");
	}

}
