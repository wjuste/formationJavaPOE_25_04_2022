package fr.dawan.formation;

/*
 * Un thread nous permet d'executer des morceaux de programmes (codes)
 * diff�rents mais en parallelle (en m�me temps)
 * 
 * Un thread est une unit� d'execution faisant partie d'un programme 
 * Cette unit� fonctionne de fa�on autonomme et parallelemet � 
 * d'autres Threads. 
 * 
 * Le principal avantage des threads est de pouvoir r�partir differents 
 * traitements d'un m�me programme en plusieurs unit�s distinctes pour 
 * permettre leurs executions "simultan�es"
 * 
 * On peut decrire un Thread de 2 mani�res : 
 * 1- En cr�ant une classe qui implemente l'interface Runnable et redefinie 
 * une methode run() 
 *  2- En cr�ant une classe qui herite de la classe Thread et redefinie 
 * aune methode run()  
 * 
 * ==> run() est la m�thode qui sera execut�e quand on va executer le thread
 */
public class Application {

	public static void main(String[] args) {
		
		
		//On peut ecrire un Thread de 2 mani�res : 
		
		//1-En creant une classe qui herite de  Thread et en 
		//redefinissant la m�thode run()
		MyThread th1 = new MyThread(100);
		th1.setName("T1"); //setName permet de nommer un thread
		MyThread th2 = new MyThread(200);
		th2.setName("T2"); //setName permet de nommer un thread
		
		//th1.start();
		
		//Le thread devient un Thread demon : La m�thode main va finir 
		//m�me si le thread n'a pas finis son execution
		//th2.setDaemon(true);
		
		//Attendre la fin de l'execution du thread
//		try {
//			//join : Pour continuer l'execution de la m�thode main 
//			//Il faut que le thread th2 ait fini son execution
//			th1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//interupt va lancer une exception InterruptedException dans le Thread
		//th1.interrupt();
		
		//th2.start();
		
		//Connaitre le thread en cours
		//System.out.println(Thread.currentThread().getName());
		
		
		//2-En cr�ant une classe qui implemente l'interface Runnable
		
		//Pour instancier le Thread 
		MyRunnable run1 = new MyRunnable();
		Thread t1 = new Thread(run1);
		t1.start(); //Lancer l'execution du Thread
		
		/*
		 * Lorsque la JVM d�marre, elle cr�e un Thread appel� Main
		 * Votre programme s'�xecutera sur ce Thread 
		 * La premi�re chose que le thread "principal" fait est de 
		 * rechercher votre m�thode static void main(String[] args)
		 * et de l'invoquer. C'est le point d'entrer de votre programme 
		 *Montrer que le code principale fonctionne en m�me temps 
		 *(en parall�le)
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("Operation principale");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}

}
