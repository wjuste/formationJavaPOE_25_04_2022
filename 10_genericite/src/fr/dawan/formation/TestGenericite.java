package fr.dawan.formation;

import java.util.ArrayList;
import java.util.List;

/*
 * La généricité permet d'exprimer des classes et des méthodes qui 
 * sont identiques sur le plan algorithmique mais différent 
 * sur la base des types de données  
 * 
 * Optimisation code 
 * Mons de cast à faire - Moins de risuqe d'erreurs à l'execution
 */
public class TestGenericite {

	public static void main(String[] args) {
		
		//Sans la généricité
		List list = new ArrayList();
		list.add(1);
		Integer integer = (Integer) list.get(0);//Le casting est obligatoire
		
		list.add(1.5);
		Double double1 = (Double) list.get(1);  //Le casting est obligatoire
		
		//Solution : Utilisation de la généricité
		List<Double> list3 = new ArrayList<Double>();
		list3.add(2.5);
		Double double2 = list3.get(0);
		
		/*
		 * Donc la programmation générique permet d'ecrire du code 
		 * qui peut être réutilisé pour des objets de types différent
		 * Nous avons plus  besoin de programmer des classes différentes 
		 * pour collecter les objets String, Double, Integer, BankAccount
		 * car List ou ArrayList collecte les objets de n'importe quelle classe
		 */
		
		Calcul<Integer> cl1 = new Calcul<Integer>();
		cl1.setA(5);
		cl1.setB(8);
		System.out.println(cl1.getA() + " -- " + cl1.getB());
		cl1.permuter();
		System.out.println(cl1.getA() + " -- " + cl1.getB());
		
		Calcul<BankAccount> cl2 = new Calcul<BankAccount>();
		cl2.setA(new BankAccount("aaa", 100.0));
		cl2.setB(new BankAccount("bbb", 300.0));
		System.out.println(cl2.getA().getBalance()+ " -- " + cl2.getB().getBalance());
		cl2.permuter();
		System.out.println(cl2.getA().getBalance()+ " -- " + cl2.getB().getBalance());
				

	}

}
