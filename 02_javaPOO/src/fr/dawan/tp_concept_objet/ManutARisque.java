package fr.dawan.tp_concept_objet;

public class ManutARisque extends Manutentionnaire implements IARisque{

	public ManutARisque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManutARisque(String nom, String prenom, int age, String date, int heures) {
		super(nom, prenom, age, date, heures);
		// TODO Auto-generated constructor stub
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
