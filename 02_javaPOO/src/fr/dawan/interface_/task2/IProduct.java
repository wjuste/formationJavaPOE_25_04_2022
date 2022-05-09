package fr.dawan.interface_.task2;

import java.util.List;

public interface IProduct {
	
	//Lister l'ensemble des fonctionalité du client 
	void addProduct(Product p);
	void deleteProductById(int id);
	void updateProduct(Product p);
	List<Product> getAll();
	
}
