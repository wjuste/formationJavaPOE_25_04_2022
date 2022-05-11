package fr.dawan.formation;

import java.util.Comparator;

public class AccountDESCComparator implements Comparator<BankAccount>{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		if(o1.getBalance().equals(o2.getBalance()))
			return 0;
		else if (o1.getBalance() > o2.getBalance())
			return -1;
		else 
			return 1;
	}

}
