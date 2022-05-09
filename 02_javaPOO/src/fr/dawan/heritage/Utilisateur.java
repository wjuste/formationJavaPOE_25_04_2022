package fr.dawan.heritage;

/*
 * Nous allons voir l'utilité des accesseurs (Getters) et 
 * l'utilité des mutateurs (Setters) en java 
 * 
 * Un Getter et un Setter ce sont deux méthodes qui permettent de 
 * lire (Getter) et de  modifier (Setter) l'attribut
 * 
 * Les getters et les setters permette de mettre en place des
 * restrictions et des contraintes sur l'accès ou la mise à 
 * jours des attributs
 */
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


	//Constructeur par defaut (sans paramètre)
	public Utilisateur() {
		nbreUtilisateur++;
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

	//Methde de classe : Classe.Methode 
	public static int getNbreUtilisateur() {
		return nbreUtilisateur;
	}

	  String decrisToi() {
		String str = "Je suis la classe Utilisateur";
		return str;
	}
}
