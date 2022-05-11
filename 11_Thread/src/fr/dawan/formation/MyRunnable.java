package fr.dawan.formation;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runnable = " + i);
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
