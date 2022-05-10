package fr.dawan.formation;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

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
//		System.out.println("\n Saisir une date (dd/MM/yyyy)");
//		Scanner sc = new Scanner(System.in);
//		String saisie = sc.nextLine();
//		try {
//			Date d2 = sdf.parse(saisie);
//			System.out.println("Vous avez saisie : " + sdf.format(d2));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/*
		 * Calendar
		 */
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.set(2022, 04, 22);
		Date d3 = myCalendar.getTime();
		System.out.println("\nAvec  Calendar\t" + sdf.format(d3));
		
		
		System.out.println("\n*************** Avec Java 8*****************");
		LocalDate ld1 = LocalDate.of(2022, 04, 01);
		System.out.println("ld1 = " + ld1);
		
		//Formatter une date 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(ld1));
		
		System.out.println("Date/Heure : " + LocalDateTime.now());
		
		//Pour récuperer une heure et une date en fonction d'un fuseau horaire 
		System.out.println("TAHITI : " + LocalDateTime.now(
				Clock.system(ZoneId.of("Pacific/Tahiti"))));
		
		//durée 5j
		//PT : Period of Time
		Duration duration1 = Duration.ofDays(5);
		System.out.println(duration1);
		
		Duration duration2 = Duration.of(5, ChronoUnit.DAYS);
		System.out.println(duration2);
		
		//133333s depuis l'Epoch (01/01/1970)
		//L'Epoch represente la date initiale à partir de laquelle 
		//est mesuré le temps dans un programme
		Instant inst1 = Instant.ofEpochSecond(133333);
		System.out.println(inst1);
		
		//Period
		LocalDate now = LocalDate.now();  //Recupère la date d'aujourd'hui
		LocalDate dateOfBirth = LocalDate.of(1993, 02, 19);
		Period p = dateOfBirth.until(now);
		System.out.println("age = " + p.getYears() + " years & "
				+ p.getMonths() + " months & "
						+ p.getDays() + " days");
	}

}
