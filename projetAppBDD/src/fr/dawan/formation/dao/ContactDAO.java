package fr.dawan.formation.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.dawan.formation.entity.Contact;

public class ContactDAO {
	
	public static Contact findById(int id, Connection cnx) throws Exception {
		Contact contact = null;
		String sql = "SELECT * FROM contacts WHERE id=?";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			contact = new Contact(rs.getString("prenom"), rs.getString("nom"),
					rs.getString("email"), rs.getDate("date_naissance").toLocalDate());
			contact.setId(id);
		rs.close();
		} else {
			throw new Exception("Le Contact n'existe pas!!!");
		}
		return contact;
	}
	
	public static List<Contact> findAll(Connection cnx) throws SQLException{
		List<Contact> lc = new ArrayList<Contact>();
		String sql = "SELECT * FROM contacts";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Contact c = new Contact(rs.getString("prenom"), 
					rs.getString("nom"), rs.getString("email"), 
					rs.getDate("date_naissance").toLocalDate());
			c.setId(rs.getInt("id"));
			lc.add(c);	
		}
		rs.close();
		return lc;
	}
	
	public static void addContact(Contact contact, Connection cnx) throws SQLException {
		String sql = "INSERT INTO contacts(prenom, nom, email, date_naissance)"
				+ "VALUES (?, ?, ?, ?)";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setString(1, contact.getPrenom());
		ps.setString(2, contact.getNom());
		ps.setString(3, contact.getEmail());
		ps.setDate(4, Date.valueOf(contact.getDateNaissance()));

		ps.executeUpdate();
		ps.close();
	}
	
	public static void updateContact(Contact c, Connection cnx) throws SQLException {
		String sql = "UPDATE contacts SET prenom=?, nom=?, "
				+ "email=?, date_naissance=? WHERE id=?";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setString(1, c.getPrenom());
		ps.setString(2, c.getNom());
		ps.setString(3, c.getEmail());
		ps.setDate(4, Date.valueOf(c.getDateNaissance()));
		ps.setInt(5, c.getId());
		ps.executeUpdate();
		ps.close();
	}
	
	public static List<Contact> findByDateNaissance(LocalDate dateNaissance, Connection cnx) throws SQLException {
		List<Contact> lc = new ArrayList<Contact>();
		String sql = "SELECT * FROM contacts WHERE date_naissance=?";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setDate(1, Date.valueOf(dateNaissance));
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Contact c = new Contact(rs.getString("prenom"), rs.getString("nom"), 
					rs.getString("email"), rs.getDate("date_naissance").toLocalDate());
					c.setId(rs.getInt("id"));
			lc.add(c);
		}
		
		if(lc.isEmpty()) {
			System.out.println("Il n'y a pas de contact avec cette date de "
					+ "de naissance");
		}
		
		rs.close();
		return lc;
	}
	
	public static void deleteById(int id, Connection cnx) throws SQLException {
		String sql = "DELETE FROM contacts WHERE id=?";
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
	}
}
