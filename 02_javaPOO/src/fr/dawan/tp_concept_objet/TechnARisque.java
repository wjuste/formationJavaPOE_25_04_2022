package fr.dawan.tp_concept_objet;

public class TechnARisque extends Technicien implements IARisque{

	public TechnARisque() {
		super();
	}

	public TechnARisque(String nom, String prenom, int age, String date, int unites) {
		super(nom, prenom, age, date, unites);
	}

	
	
	@Override
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME;
	}

	@Override
	public String getTitre() {
		return super.getTitre();
	}

	
}
