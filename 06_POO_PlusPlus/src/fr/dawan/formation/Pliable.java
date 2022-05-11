package fr.dawan.formation;

public interface Pliable {
	
	public static final int MY_COEFF = 45;
	
	default void plier() {
		System.out.println("Plier...");
	}
	
	static void m3() {
		System.out.println("Helloooo");
	}
	
	void deplier();
}
