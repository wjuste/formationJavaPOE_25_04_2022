package fr.dawan.abstraction;

public class Cercle extends Forme{

	protected int rayon = 4;


	@Override
	public double aire() {
		return Math.PI*rayon*rayon;
	}

}
