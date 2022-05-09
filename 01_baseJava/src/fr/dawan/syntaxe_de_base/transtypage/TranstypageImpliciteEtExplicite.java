package fr.dawan.syntaxe_de_base.transtypage;

public class TranstypageImpliciteEtExplicite {

	public static void main(String[] args) {

		//Transtypage implicte : Concerne le passage d'un type inferieur 
		//vers un type superieur
		int i = 42; 
		double d = i;
		System.out.println(d);
		
		//Transtypage explicte (cast)
		//Passage d'un type superieur vers un type inferieur, cela implique 
		//de faire un cast
		//Cast : CONCERNE LES CONVERSIONS DES TYPES COMPATIBLES
		int i1 = 123;
		short s = (short) i1;
		
		double d1 = 44.95;
		int i2 = (int) d1;
		System.out.println("i2 = " + i2);  //44
		
		
		//ex: [-128 127]
		int i3 = 130; //-128 -127 -126
		byte b = (byte) i3;
		System.out.println(b);
	}

}
