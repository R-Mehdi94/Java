package fr.voxilud.admin;

import java.time.LocalDate;

public class AppAdmin {

	public static void main(String[] args) {
		
		System.out.println( "\n\n-----[Question 4-a]-----\n\n" ) ;
		
		Abonnement abn1 = new Abonnement(201 , LocalDate.of(2021, 01, 03));
			
		System.out.println(abn1);
		
		System.out.println( "\n\n-----[Question 4-b]-----\n\n" ) ;
		
		Abonnement abn2 = new Abonnement(202 , LocalDate.of(2021, 01, 10));
		
		System.out.println(abn2);
		
		System.out.println( "\n\n-----[Question 4-c]-----\n\n" ) ;
		
		System.out.println(Abonnement.getDureeAbo());
		
		/*System.out.println( "\n\n-----[Question 4-d]-----\n\n" ) ;*/
		
		Abonnement.setDureeAbo(5);
		
		System.out.println( "\n\n-----[Question 4-e]-----\n\n" ) ;
		
		System.out.println(Abonnement.getDureeAbo());
		
		/*System.out.println( "\n\n-----[Question 4-f]-----\n\n" ) ;*/
		
		abn1.setDureeAbo(7);
		
		System.out.println( "\n\n-----[Question 4-g]-----\n\n" ) ;
		
		System.out.println(abn1.getDureeAbo());
		
		System.out.println( "\n\n-----[Question 4-h]-----\n\n" ) ;
		
		System.out.println(abn2.getDureeAbo());
		
		System.out.println( "\n\n-----[Question 4-i]-----\n\n" ) ;
		
		System.out.println(Abonnement.getDureeAbo());
	}

}
