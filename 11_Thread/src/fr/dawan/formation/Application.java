package fr.dawan.formation;

/*
 * Un thread nous permet d'executer des morceaux de programmes (codes)
 * différents mais en parallelle (en même temps)
 * 
 * Un thread est une unité d'execution faisant partie d'un programme 
 * Cette unité fonctionne de façon autonomme et parallelemet à 
 * d'autres Threads. 
 * 
 * Le principal avantage des threads est de pouvoir répartir differents 
 * traitements d'un même programme en plusieurs unités distinctes pour 
 * permettre leurs executions "simultanées"
 * 
 * On peut decrire un Thread de 2 manières : 
 * 1- En créant une classe qui implemente l'interface Runnable et redefinie 
 * une methode run() 
 *  2- En créant une classe qui herite de la classe Thread et redefinie 
 * aune methode run()  
 * 
 * ==> run() est la méthode qui sera executée quand on va executer le thread
 */
public class Application {

	public static void main(String[] args) {
		
		
		//On peut ecrire un Thread de 2 manières : 
		
		//1-En creant une classe qui herite de  Thread et en 
		//redefinissant la méthode run()
		MyThread th1 = new MyThread(100);
		th1.setName("T1"); //setName permet de nommer un thread
		MyThread th2 = new MyThread(200);
		th2.setName("T2"); //setName permet de nommer un thread
		
		//th1.start();
		
		//Le thread devient un Thread demon : La méthode main va finir 
		//même si le thread n'a pas finis son execution
		//th2.setDaemon(true);
		
		//Attendre la fin de l'execution du thread
//		try {
//			//join : Pour continuer l'execution de la méthode main 
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
		
		
		//2-En créant une classe qui implemente l'interface Runnable
		
		//Pour instancier le Thread 
		MyRunnable run1 = new MyRunnable();
		Thread t1 = new Thread(run1);
		t1.start(); //Lancer l'execution du Thread
		
		/*
		 * Lorsque la JVM démarre, elle crée un Thread appelé Main
		 * Votre programme s'éxecutera sur ce Thread 
		 * La première chose que le thread "principal" fait est de 
		 * rechercher votre méthode static void main(String[] args)
		 * et de l'invoquer. C'est le point d'entrer de votre programme 
		 *Montrer que le code principale fonctionne en même temps 
		 *(en parallèle)
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
