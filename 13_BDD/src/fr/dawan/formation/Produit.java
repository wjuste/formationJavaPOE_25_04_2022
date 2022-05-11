package fr.dawan.formation;

import java.io.Serializable;

public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7845953159131983568L;
	
	private int id;
	private String description;
	private double prix;
	
	public Produit() {
		super();
	}

	public Produit(String description, double prix) {
		super();
		this.description = description;
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", description=" + description + ", prix=" + prix + "]";
	}
	
	
}
