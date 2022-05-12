package fr.dawan.formation.entity;

import java.io.Serializable;

public class AbstractEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8736267338604753373L;
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return  "id=" + id;
	}
	
	
}
