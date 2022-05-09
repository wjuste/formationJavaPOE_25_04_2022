package fr.dawan.encapsulation;

public class UtilisateurTest {

	public static void main(String[] args) {
		
		//Un objet est crée avec le mot clé "new + constructeur"
		Utilisateur user1 = new Utilisateur();
	
		Utilisateur user3 = new Utilisateur("Rudd", "Emily", 27);
		
		System.out.println("\n***********Utilisation des getters et setters*************");
		
		user3.setAge(12);
		System.out.println("Age : " + user3.getAge() + " ans. \n");

		System.out.println("Nombre d'utilisateur : " + Utilisateur.getNbreUtilisateur());
		 
	}

}
