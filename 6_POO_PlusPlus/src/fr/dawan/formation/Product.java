package fr.dawan.formation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * Serializable est une interface marqueur sans aucune méthode 
 * indiquant que la classe peut être serialisée
 */
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7392188039528980185L;
	
	//Attributs (Variables)
	private String description; //variable d'instance
	private double price;
	
	private static int nbProducts; //variable de classe
	private static List<Product> lp;
	
	private Supplier supplier;
	
	/*
	 * Le bloc d'initialisation static : 
	 * Ces blocs s'executent une seule fois lors du chargement de la classe
	 * et ne s'executent pas lors de l'instanciation de la classe, ils 
	 * sont lancés avant l'appel des constructeurs
	 * 
	 * Le bloc statique pour inialiser les variables statiques
	 */
	static {
		System.out.println("Bloc static d'initialisation");
		lp = new ArrayList<Product>();
		lp.add(new Product());
	}

	public Product() {
		super();
		System.out.println("Constructeur sans Arguments");
		supplier = new Supplier();
	}

	public Product(String description, double price, Supplier supplier) {
		super();
		System.out.println("Constructeur avec arguments");
		this.description = description;
		this.price = price;
		this.supplier = supplier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static int getNbProducts() {
		return nbProducts;
	}

	public static void setNbProducts(int nbProducts) {
		Product.nbProducts = nbProducts;
	}

	public static List<Product> getLp() {
		return lp;
	}

	public static void setLp(List<Product> lp) {
		Product.lp = lp;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	
}
