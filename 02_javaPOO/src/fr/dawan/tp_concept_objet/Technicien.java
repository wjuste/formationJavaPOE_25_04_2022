package fr.dawan.tp_concept_objet;

public class Technicien extends Employe{
	
	private int unites;
	private final static double FACTEUR_UNITES = 5.0;
	

	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, int age, String date, int unites) {
		super(nom, prenom, age, date);
		this.unites = unites;
	}


	@Override
	public double calculerSalaire() {
		return FACTEUR_UNITES * unites;
	}



	@Override
	public String getTitre() {
		return "Le Technicien ";
	}
	
	

}
