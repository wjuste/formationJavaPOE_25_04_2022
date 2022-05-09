package fr.dawan.exception_.exception_personnalisee;

public class Application {

	public static void main(String[] args) {
		Parking parc = new Parking();
		
		try {
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
		} catch (ParkingPleinException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			garerVoiture(12);
		} catch (MonException e) {
			System.out.println(e.getMessage());
		}
	}

	static void garerVoiture(int nbreVoitureGarer) throws MonException {
		int placeParking = 10;
		if(nbreVoitureGarer > placeParking) {
			throw new MonException("Plus de places sur le parking");
		}
	}
	
}
