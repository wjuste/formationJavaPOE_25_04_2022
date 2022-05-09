package fr.dawan.formation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestPOO {

	public static void main(String[] args) {
		//NomClass var = new Constructeur();
		Computer c1 = new Computer();
		c1.setDescription("DELL XYZ");
		System.out.println(c1.getDescription());
		
		int[] tab = new int[] {2, 4, 5};
		int s1 = MyTool.somme(tab);
		int s2 = MyTool.somme(6, 78);
		int s3 = MyTool.somme(6, 78, 78, 67);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
		SavingAccount acc1 = new SavingAccount();
		try {
			acc1.deposit(-3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Pliable pliable = new PliableImpl();
		pliable.plier();
		Pliable.m3();
		
		//------------Comparaison d'objet------------------
		Book b1 = new Book("Java", "Author", 100);
		Book b2 = new Book("Java", "Author", 100);
		//Compare les pointeurs => false
		System.out.println("Comparaison avec == : " + (b1==b2)); 
		System.out.println("Comparaison avec equals : " + b1.equals(b2));
		
		//----------------------------------
		BankAccount ba1 = new BankAccount("xyz1", 400.0);
		BankAccount ba2 = new BankAccount("xyz1", 200.0);
		System.out.println(ba1.equals(ba2));
		System.out.println(ba1.compareTo(ba2));
		
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(ba1);
		accounts.add(ba2);
		
		
		//Trie les données selon l'ordre de tri naturel (ordre croissant)
		Collections.sort(accounts);
		
		accounts.sort(new AccountASCComparator());
		
		System.out.println("Après trie sur solde : ");
		for (BankAccount bankAccount : accounts) {
			System.out.println(bankAccount.getNumber() + "\t" 
					+ bankAccount.getBalance());
		}
	}

}
