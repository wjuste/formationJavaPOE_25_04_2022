package fr.dawan.formation;

import java.sql.Connection;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		//Création d'un objet connexion 
		Connection cnx1 = ConnexionBDD.getConnection();
		
		
		try {
			//Test methode getAll
			List<Produit> lp = ProduitDAO.getAll(cnx1);
			System.out.println(lp);
			
			//Tester  methode insert
//			Produit p = new Produit("IPhone 13", 1200);
//			ProduitDAO.insert(p, cnx1);
			
			//Test méthode deleteById
			ProduitDAO.deleteById(1, cnx1);
			
			//Test findById
			Produit p = ProduitDAO.findById(2, cnx1);
			System.out.println("Produit ayant l'id=2" + p);
			
			//test update
			Produit p3 = ProduitDAO.findById(4, cnx1);
			p3.setDescription("Ecran MSI");
			p3.setPrix(150);
			
			ProduitDAO.update(p3, cnx1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
