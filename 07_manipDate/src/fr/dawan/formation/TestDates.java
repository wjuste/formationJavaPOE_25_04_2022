package fr.dawan.formation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDates {

	public static void main(String[] args) {
		//Avant Java 8
		System.out.println("***************Avant Java 8*****************");
		
		Date d1 = new Date();
		System.out.println(d1);  //affiche la date d'aujourd'hui
		
		//date -> String = format
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String str = sdf.format(d1);
		System.out.println("date formatée : " + str);
		
		//String -> date = parse 
		System.out.println("\n Saisir une date (dd/MM/yyyy)");
		Scanner sc = new Scanner(System.in);
		String saisie = sc.nextLine();
		try {
			Date d2 = sdf.parse(saisie);
			System.out.println("Vous avez saisie : " + sdf.format(d2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

}
