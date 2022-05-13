package fr.dawan.formation.introduction_swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fenetre {

	public static void main(String[] args) {
		
		//1-Création d'une fenêtre 
		JFrame frame = new JFrame("Introduction swing");
		
		//Affichage de la fenetre
		frame.setVisible(true);
		
		/*
		 * EXIT_ON_CLOSE : Elle est un peu violente car si on a une application
		 * qui utilise plusieurs JFrame, la fermeture de l'un conduira 
		 * à la fermeture des autres
		 * 
		 * DISPOSE_ON_CLOSE : Quand on ferme la fenêtre cela va invoquer une 
		 * méthode dispose. Cette méthode libère toutes les ressources de la 
		 * fenêtre. Elle est utilisé pour fermer la fenêtre courante 
		 * mais ne met pas fin à l'application
		 */
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//setSize => definir les dimensions de la fenêtre 
		frame.setSize(800, 600);
		
		//setMinimumSize  ==> taille minimal dela fenêtre
		frame.setMinimumSize(new Dimension(300, 200));
		
		//2-Ajouter un composant dans la fenêtre 
		JButton bp1 = new JButton("Bouton 1");  //création d'un bouton
		
		//getContentPane retourne un conteneur
		//frame.getContentPane().add(bp1);
		
		
		//3-POSITIONNEMENT DES COMPOSANTS 
		//LayoutManagers (gestionnaire de positionnement) utilisent 
		//des politiques différentes pour le placement des composants 
		
		
		//3.1 -> POSITIONNEMENT ABSOLUE
		//frame.setLayout(null);
		
		//setBounds  => Permet de definir la position et la taille
		//bp1.setBounds(50, 50, 200, 100);
		
		//frame.getContentPane().add(bp1);
		
		//3.2 -> FlowLayout
		//flowLayout(frame, bp1);
		
		
		//3.3 -> BorderLayout
		//borderLayout(frame, bp1);
		
		//3.4 -> GridLayout
		GridLayout gridLayout = new GridLayout();
		gridLayout.setRows(4);	 //nb composant par ligne -> 4
		gridLayout.setColumns(4);  //Nb composant par colonne  -> 4
		gridLayout.setHgap(20); //distance horizontale entre les composants -> 20
		gridLayout.setVgap(20); //distance verticale entre les composants -> 20
		frame.getContentPane().setLayout(gridLayout);
		
		for (int i = 0; i < 20; i++) {  //ajout des boutons
			frame.getContentPane().add(new JButton(Integer.toString(i+1)));
		}
		
		
	}

	private static void borderLayout(JFrame frame, JButton bp1) {
		frame.getContentPane().setLayout(new BorderLayout(10, 20));
		
		frame.getContentPane().add(bp1, BorderLayout.NORTH);
		frame.getContentPane().add(new JButton("Button gauche"), BorderLayout.WEST);
		frame.getContentPane().add(new JButton("Button sud"), BorderLayout.SOUTH);
		frame.getContentPane().add(new JButton("Button centre"), BorderLayout.CENTER);
	}

	private static void flowLayout(JFrame frame, JButton bp1) {
		//frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//Distance entre les composants (gap) 
		//horizontal -> 10 
		//vertical -> 30
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 10, 30));
		frame.getContentPane().add(bp1);
		
		//Dimension préféré du bouton bp1
		bp1.setPreferredSize(new Dimension(200,100));
		
		frame.getContentPane().add(new JButton("Button 2"));
		frame.getContentPane().add(new JButton("Button 3"));
		
		
	}

}
