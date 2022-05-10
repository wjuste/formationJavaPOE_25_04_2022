package fr.dawan.formation.serialisation_perf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * L"'utilisation d'un Buffer permet une nette amélioration des 
 * performances de notre code 
 * Dans le cas où on a à lire une norme fichier texte (3.6 MO)
 */
public class TestSerialisation {
	
	
	
	public static void toBin(Produit p, String path) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			//1er façon
			fos = new FileOutputStream(path);	
			bos = new BufferedOutputStream(fos);
		
			//2ème façon
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
				e.printStackTrace();
			}
		}

	}
	
	public static Produit fromBin(String path) {
		Object o = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(path));
			ois = new ObjectInputStream(bis);
			o = ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(o instanceof Produit) {
			return (Produit) o;
		} else {
			return null;
		}
	}


}
