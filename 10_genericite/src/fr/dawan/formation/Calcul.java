package fr.dawan.formation;

import java.util.ArrayList;
import java.util.List;

//On peut faire des restrictions sur le generic
//public class Calcul<T extends BankAccount> {	

public class Calcul<T> {
	private T a;
	private T b;
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getB() {
		return b;
	}
	public void setB(T b) {
		this.b = b;
	}
	
	public void permuter() {
		T temp = a;
		a = b;
		b = temp;
	}
	
	
}
