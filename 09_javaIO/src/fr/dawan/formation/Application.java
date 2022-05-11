package fr.dawan.formation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application {
	public static void main(String[] args) {
		Personne p = new Personne();
		p.setAge(10);
		System.out.println(p.getCodeSecret());
		
		String path = "C:/tempData1/adress.txt";
		
		//Serialisation d'un objet adresse 
		Adresse adr = new Adresse("Place occitanie", "Toulouse", 31000);
		
		//Nous déclarons nos objets en dehors du try/catch
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		try {
			/*
			 * Création d'un flux de sortie vers le chemin du fichier
			 * s'il existe pas il sera crée sinon il sera écrasé
			 */
			fos = new FileOutputStream(path);
			/*
			 * La classe ObjectOutputStream permet de sérialiser 
			 * un objet 
			 * Crée une instance qui va ecrire le resultat de la serialisation 
			 * dans le plus fourni en paramètre (fos)
			 */
			oos = new ObjectOutputStream(fos);
			
			//Ecriture de sortie de l'objet adresse 
			oos.writeObject(adr);
			
		} catch (FileNotFoundException e) {
			//Celle-ci est lévée lors d'une erreur d'ecriture  ou de lecture
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//On ferme nos flux de donnée dans un bloc finnaly pour s'assurer 
			//que ces instructions seront executées dans tous les cas 
			//même si une exception est levée
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * Etape de lecture 
		 */
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object o;
		
		//Création d'un flux d'entrée ayant pour source le chemin vers le fichier
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			//Lecture
			o = ois.readObject();
			
			if(o instanceof Adresse) {
				Adresse adr2 = (Adresse) o;
				System.out.println(adr2);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
