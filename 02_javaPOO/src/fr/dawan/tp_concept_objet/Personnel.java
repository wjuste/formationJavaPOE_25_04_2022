package fr.dawan.tp_concept_objet;

import java.util.ArrayList;
import java.util.List;

public class Personnel implements IPersonnel{

	List<Employe> lstEmploye;
	

	public Personnel() {
		super();
		lstEmploye = new ArrayList<Employe>();
	}

	@Override
	public void ajouterEmploye(Employe employe) {
		lstEmploye.add(employe);
		
	}

	/**
	 * Affiche le salaire de chacun des employés de la collection.
	 */
	@Override
	public void calculerSalaires() {
		for (Employe employe : lstEmploye) {
			System.out.println(employe.getNom() + " gagne " 
					+ employe.calculerSalaire() + " euros");
		}
		
	}

	@Override
	public double salaireMoyen() {
		double somme = 0.0;
		for (int i = 0; i < lstEmploye.size(); i++) {
			somme += lstEmploye.get(i).calculerSalaire();
		}
		return somme / lstEmploye.size();
	}

}
