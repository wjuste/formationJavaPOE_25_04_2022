package fr.dawan.formation.presentation;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import fr.dawan.formation.dao.ConnexionBDD;
import fr.dawan.formation.dao.ContactDAO;
import fr.dawan.formation.entity.Contact;

public class Application {

	public static void main(String[] args) {
		Connection cnx = ConnexionBDD.getConnection();
		
		try {
			//Test findById
			Contact contact = ContactDAO.findById(1, cnx);
			System.out.println(contact);
			
			//Test findAll 
			List<Contact> lc = ContactDAO.findAll(cnx);
			System.out.println(lc);
			
			//Test addContact 
			Contact c = new Contact("Toto", "Titi", "toto@gmail.com", 
					LocalDate.of(1998, 7, 3));
			ContactDAO.addContact(c, cnx);
			
			//Test findByDateNaissance (pas de date de naissance dans la base de données) 
			LocalDate dateTest1 = LocalDate.of(2021, 7, 3);
			List<Contact> lcDate1 = ContactDAO.findByDateNaissance(dateTest1, cnx);
			System.out.println(lcDate1);
			
			
			//Test findByDateNaissance (avec dates de naissance dans la base de données) 
			LocalDate dateTest2 = LocalDate.of(2022, 01, 02);
			List<Contact> lcDate2 = ContactDAO.findByDateNaissance(dateTest2, cnx);
			System.out.println(lcDate2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
