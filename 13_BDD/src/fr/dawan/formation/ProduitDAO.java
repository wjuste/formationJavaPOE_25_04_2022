package fr.dawan.formation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * 1-Cr�er la table 
 * 2-Installer le driver
 * 3-Creer une classe pour etablir la connexion 
 * 4-Une classe DAO pour definir nos op�ration sur notre table
 */

/*
 * Un DAO (Data Access Object) contient les diff�rentes op�rations qu'on 
 * effectue sur une base de donn�e nomm� CRUD
 * CRUD : Create - Read - Update - Delete
 * 
 * Deux m�thodes : 
 * 		- executeQuery  ::::Lire les donn�es 
 * 		- executeUpdate ::: modifier les donn�es (ajouter, effacer, mises � jours)
 */
public class ProduitDAO {
	
	public static List<Produit> getAll(Connection cnx) throws SQLException {
		
		List<Produit> lp = new ArrayList<Produit>();
		
		//Requ�te sql 
		String sql = "SELECT * FROM produit";
		
		//Cr�er un objet PrepareStatement 
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//Cr�er un objet resulset qui contient l'ensemble des enregistrement
		//(liste) de notre table
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Produit p = new Produit();
			
			//Cr�ation des attributs du produits via les setters
			p.setId(rs.getInt("id"));
			p.setDescription(rs.getString("description"));
			p.setPrix(rs.getDouble("prix"));
			
			lp.add(p);
		}
		
		rs.close();
		return lp;
	}
	
	
	public static void insert(Produit produit, Connection cnx) throws SQLException {
		
		//Requ�te SQL 
		String sql = "INSERT INTO produit(description, prix) "
				+ "VALUES (?, ?)";
		
		//Cr�er un Objet PreparedStatement
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//R�cuperer les VALUES � inserer � partir du produit 
		//d�finis dans les param�tres 
		ps.setString(1, produit.getDescription());
		ps.setDouble(2, produit.getPrix());
		
		ps.executeUpdate();
		
		ps.close();
		
	}
	
	public static void deleteById(int id, Connection cnx) throws SQLException {
		
		//Requ�te 
		String sql = "DELETE FROM produit WHERE id=?";
		
		//PrepareStatement 
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		//R�cup�re l'id
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
