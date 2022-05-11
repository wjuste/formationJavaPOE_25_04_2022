package fr.dawan.formation;

public class Book extends TrainingSupport{

	private int nbPages;
	
	public Book() {
		super();
	}

	
	public Book(String title, String author, int nbPages) {
		super(title, author);
		this.nbPages = nbPages;
	}


	public int getNbPages() {
		return nbPages;
	}


	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	@Override
	public void print() {
		
	}

}
