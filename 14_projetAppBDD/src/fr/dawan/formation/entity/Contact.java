package fr.dawan.formation.entity;

import java.time.LocalDate;

public class Contact extends AbstractEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 909869080827545514L;
	
	private String nom;
	private String prenom;
	private String email;
	private LocalDate dateNaissance;
	
	
	public Contact() {
		super();
	}


	public Contact(String prenom, String nom, String email, LocalDate dateNaissance) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.dateNaissance = dateNaissance;
	}



	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	@Override
	public String toString() {
		return "Contact [" + super.toString() + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", dateNaissance="
				+ dateNaissance + "]";
	}
	
	

}
