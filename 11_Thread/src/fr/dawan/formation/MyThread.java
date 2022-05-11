package fr.dawan.formation;

public class MyThread extends Thread{
	
	private int time_ms;
	
	
	public MyThread(int time_ms) {
		super();
		this.time_ms = time_ms;
	}


	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + " " + i);

			try {
				//La methode static sleep() de la classe Thread permet de 
				//mettre en sommeil le thread
				sleep(time_ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	
}
