package fr.dawan.formation;

public class SavingAccount extends BankAccount{

	@Override
	public void deposit(double amount) throws Exception {
		super.deposit(amount);
		setBalance(getBalance() + 5);
	}
	
	
	
}
