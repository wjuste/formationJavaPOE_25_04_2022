package fr.dawan.formation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * 1-Créer la table 
 * 2-Installer le driver
 * 3-Creer une classe pour etablir la connexion 
 * 4-Une classe DAO pour definir nos opération sur notre table
 */

/*
 * Un DAO (Data Access Object) contient les différentes opérations qu'on 
 * effectue sur une base de donnée nommé CRUD
 * CRUD : Create - Read - Update - Delete
 * 
 * Deux méthodes : 
 * 		- executeQuery  ::::Lire les données 
 * 		- executeUpdate ::: modifier les données (ajouter, effacer, mises à jours)
 */
public class ProduitDAO {
	
	public static List<Produit> getAll(Connection cnx) throws SQLException {
		
		List<Produit> lp = new ArrayList<Produit>();
		
		//Requête sql 
		String sql = "SELECT * FROM produit";
		
		//Créer un objet PrepareStatement 
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//Créer un objet resulset qui contient l'ensemble des enregistrement
		//(liste) de notre table
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Produit p = new Produit();
			
			//Création des attributs du produits via les setters
			p.setId(rs.getInt("id"));
			p.setDescription(rs.getString("description"));
			p.setPrix(rs.getDouble("prix"));
			
			lp.add(p);
		}
		
		rs.close();
		return lp;
	}
	
	
	public static void insert(Produit produit, Connection cnx) throws SQLException {
		
		//Requête SQL 
		String sql = "INSERT INTO produit(description, prix) "
				+ "VALUES (?, ?)";
		
		//Créer un Objet PreparedStatement
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//Récuperer les VALUES à inserer à partir du produit 
		//définis dans les paramètres 
		ps.setString(1, produit.getDescription());
		ps.setDouble(2, produit.getPrix());
		
		ps.executeUpdate();
		
		ps.close();
		
	}
	
	public static void deleteById(int id, Connection cnx) throws SQLException {
		
		//Requête 
		String sql = "DELETE FROM produit WHERE id=?";
		
		//PrepareStatement 
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//Récupère l'id
		ps.setInt(1, id);
		
		ps.executeUpdate();
		
		ps.close();
	}
	
	public static void update(Produit p, Connection cnx) throws SQLException {
		String sql = "UPDATE produit SET description=?, prix=? WHERE id=?";
		
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setString(1, p.getDescription());
		ps.setDouble(2, p.getPrix());
		ps.setInt(3, p.getId());
		
		ps.executeUpdate();
		
		ps.close();
	}
	
	public static Produit findById(int id, Connection cnx) throws Exception {
		
		Produit p = new Produit();
		
		String sql = "SELECT * FROM produit WHERE id=?";
		
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs =   ps.executeQuery();
		
		if(rs.next()) {
			p.setId(rs.getInt("id"));
			p.setDescription(rs.getString("description"));
			p.setPrix(rs.getDouble("prix"));
		} else {
			throw new Exception("Produit n'existe pas !! ");
		}
		
		rs.close();
		return p;
	}
}
