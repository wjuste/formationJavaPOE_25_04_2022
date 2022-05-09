package fr.dawan.heritage;

public class Client extends Utilisateur{
	
	private String numClient;
	private boolean isSubscribe;
	
	public Client() {
	}
	
	public Client(String numClient) {
		this.numClient = numClient;
	}
	
	public String getNumClient() {
		return this.numClient;
	}
	
	public void setNumClient(String numClient) {
		this.numClient = numClient;
	}
	
	public boolean isSubscribe() {
		return this.isSubscribe;
	}
	
	public void setSubscribe(boolean isSubscribe) {
		this.isSubscribe = isSubscribe;
	}
}
