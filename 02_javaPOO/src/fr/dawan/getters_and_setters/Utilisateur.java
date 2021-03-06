package fr.dawan.getters_and_setters;

/*
 * Nous allons voir l'utilit? des accesseurs (Getters) et 
 * l'utilit? des mutateurs (Setters) en java 
 * 
 * Un Getter et un Setter ce sont deux m?thodes qui permettent de 
 * lire (Getter) et de  modifier (Setter) l'attribut
 * 
 * Les getters et les setters permette de mettre en place des
 * restrictions et des contraintes sur l'acc?s ou la mise ? 
 * jours des attributs
 */
public class Utilisateur {
	
	//Visibilit? : public 
	//Cela veut dire que les autres classes pourront acceder ? ces 
	//attributs.
	//Variable d'instance = Instance.Variable
	public String nom;
	public String prenom;
	public int age; //25
	
	//Variable de classe ==> Classe.Variable
	public static int nbreUtilisateur;
	
	//Constructeur par defaut (sans param?tre)
	public Utilisateur() {
		nbreUtilisateur++;
	}
	
	//Constructeur avec deux param?tre (nom et prenom)
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
	
}
