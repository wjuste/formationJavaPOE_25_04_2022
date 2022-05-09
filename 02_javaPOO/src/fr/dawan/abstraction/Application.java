package fr.dawan.abstraction;

public class Application {

	public static void main(String[] args) {
		System.out.println(new Carre().aire());
		System.out.println(new Triangle().aire());
		System.out.println(new Cercle().aire());
	}

}
