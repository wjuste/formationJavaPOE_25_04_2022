package fr.dawan.formation.serialisation_perf;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * L"'utilisation d'un Buffer permet une nette am�lioration des 
 * performances de notre code 
 * Dans le cas o� on a � lire une norme fichier texte (3.6 MO)
 */
public class TestSerialisation {
	
	
	
	public static void toBin(Produit p, String path) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			//1er fa�on
			fos = new FileOutputStream(path);	
			bos = new BufferedOutputStream(fos);
		
			//2�me fa�on
//			bos = new BufferedOutputStream(new FileOutputStream(path));
			oos = new ObjectOutputStream(bos);
			
			//Ecriture 
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	
	
	

}
