package fr.dawan.enumeration;

import java.io.Serializable;

public class Utilisateur {

	//Visibilité : public 
	//Cela veut dire que les autres classes pourront acceder à ces 
	//attributs.
	//Variable d'instance = Instance.Variable
	private String nom;
	private String prenom;
	private int age; //25

	//Variable de classe ==> Classe.Variable
	private static int nbreUtilisateur;

	public static final int NOMBRE_MAX_OREILLES = 2;
	
	private TypeUtilisateur typeUtilisateur;

	//Constructeur par defaut (sans paramètre)
	public Utilisateur() {
		nbreUtilisateur++;
		typeUtilisateur = TypeUtilisateur.CLIENT;
	}

	//Constructeur avec deux paramètre (nom et prenom)
	public Utilisateur(String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;

	}

	public Utilisateur(String nom, String prenom, int age) {
		this(nom, prenom);
		this.age = age;
	}

	//Getter
	public int getAge() {
		return this.age;
	}

	//Setter 
	public void setAge(int age) {
		if(age < 15) {
			System.out.println("Interdit au moins de 15 ans");
		} else {
			this.age = age;
		}
	}

	//Methode de classe : Classe.Methode 
	public static int getNbreUtilisateur() {
		return nbreUtilisateur;
	}

	  String decrisToi() {
		String str = "Je suis la classe Utilisateur";
		return str;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}
	  
}
