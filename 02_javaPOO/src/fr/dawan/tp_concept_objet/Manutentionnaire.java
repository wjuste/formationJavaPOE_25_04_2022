package fr.dawan.tp_concept_objet;

public class Manutentionnaire extends Employe{
	
	private int heures;
	private final static double SALAIRE_HORAIRE = 65.0;
	
	

	public Manutentionnaire() {
		super();
	}


	public Manutentionnaire(String nom, String prenom, int age, String date, int heures) {
		super(nom, prenom, age, date);
		this.heures = heures;
	}




	@Override
	public double calculerSalaire() {
		return SALAIRE_HORAIRE* heures;
	}

	@Override
	public String getTitre() {
		return "Le manutentionnaire ";
	}
	
	

}
