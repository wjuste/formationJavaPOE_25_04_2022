package fr.dawan.formation;

/*
 * En java pour trier des collections, on peut utiliser deux interfaces 
 * "Comparable" et "Comparator"
 * 
 * L'interface Comparable est utilisé lorsqu'on veut trier une liste 
 * d'objets en comparant deux objets avec la méthode prédifinies : 
 * object1.compareTo(object2)
 * 
 * Si on veut trier la liste selon une seule propriété : 
 * ex : balance de BankAccount
 * Cela peut être fait en implementant l'interface Comparable, 
 * puis on doit  redefinir sa méthode compareTo() pour trie 
 * l'objet BankAccount en fonction de son balance
 * 
 * 
 * Le problème ici, ce qu'on peut redefinir compareTo() qu'une seule fois 
 * dans la classe BankAccount, alors comment retrier à nouveau la liste
 * 
 * On a besoin de l'interface Comparator 
 * 
 * 
 */
public class BankAccount implements Comparable<BankAccount>{
	
	private String number; 
	private Double balance;  //solde
	
	
	public BankAccount() {
		super();
	}


	public BankAccount(String number, Double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	public void deposit(double amount) throws Exception{
		if(amount > 0) {
			this.balance += amount; //a+=b; <=> a = a + b
		} else {
			throw new Exception("Erreur: montant incorrect");
		}
	}


	@Override
	public int compareTo(BankAccount o) {
		//balance
		if(this.getBalance().equals(o.getBalance()))
			return 0;
		else if(this.getBalance() > o.getBalance())
			return 1;
		else 
			return -1;

	}
	
}
