package fr.dawan.formation;

/*
 * Le design pattern permet de s"assurer qu'une classe ne puisse produire 
 * qu'une seule et unique instance 
 * 
 */
public class Singleton {
	
	//Variable de classe (static)
	private static Singleton instance;
	
	private int compteur;
	
	//bloc static 
	/*
	 * Le bloc static dans un classe s'execute au chargement de la classe 
	 * en memoire 
	 * Une fois que la classe est chargée en memoire, c'est le bloc static 
	 * qui va s'executer. 
	 * Une fois que la classe est chargé en memoire, il y a une instance
	 * qui sera créée
	 */
	static {
		instance = new Singleton();
	}
	
	
	//Constructeur privé
	private Singleton() {
		System.out.println("Intanciation du Singleton");
	}
	
	
	//Methode static qui l'instance (objet Singleton)
	public static Singleton getInstance() {
		return instance;
	}
	
	public void traiter(String taskName) {
		//Pour chaque iteration j'affiche un compteur
		for (int i = 0; i < 5; i++) {
			++compteur;
			System.out.println(".." + compteur);
			//Je fais un sleep de 1s
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Fin du traitement de la tache "
				+ taskName + " Compteur = " + compteur);
	}
}
