package fr.dawan.abstraction;

public class Carre extends Forme{
	
	protected int cote = 4;
	
	public int prop1 = 20;
	
	/*
	 * Pour appeler le constructeur de la classe parente, il faut 
	 * utiliser le clé super()
	 * super() sans paramètre appelle le constructeur de la classe 
	 * parente sans paramètre
	 */
//	public Carre() {
//		super();
//		System.out.println("Je suis dans la classe carre");
//	}
	
//	public Carre() {
//		super("Constructeur de la classe parente avec paramètre");
//		System.out.println("Je suis dans la classe carre");
//	}
	
	//Le mot clé "super"  permet d'appeler des méthodes et attributs
	//de la classe mère 
	public Carre() {
		super();
		System.out.println(super.prop1 + this.prop1);
	}
	
	@Override
	public double aire() {
		return cote * cote;
	}


}
