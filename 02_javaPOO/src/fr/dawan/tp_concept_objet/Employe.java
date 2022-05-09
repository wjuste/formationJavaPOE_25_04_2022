package fr.dawan.tp_concept_objet;

public abstract class Employe {
	
	private String nom;
	private String prenom;
	private int age; 
	private String date;
	
	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, int age, String date) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}
	
	public abstract double calculerSalaire();
	
	public String getTitre() {
		return "L'employe ";
	}
	
	public String getNom() {
		return this.getTitre() + this.prenom + " " + this.nom;
	}
	
	
}
