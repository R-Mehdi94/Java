package fr.voxilud.admin ;

import java.time.LocalDate;

public class AppAdmin {

	public static void main(String[] args) {
		
		// Tous les affichages doivent faire apparaître le numéro de la question
		
		
		// 1- Créer puis afficher la candidature référencée par la variable cdt1
		//		Caractéristiques de la candidature :
		//			Numéro : 1
		//			État : En attente
		//			Dépôt : 11/01/2021
		
		System.out.println( "\n\n-----[Question 1]-----\n\n" ) ;
		
		/* Votre code pour la question 1 ici */

		
		Candidature cdt1 = new Candidature(1 , LocalDate.of(2021, 01, 11) );
		
		System.out.println(cdt1 + "\n\n");

		// 2- Tenter d'étudier la candidature 1
		//		Si l'opération s'est déroulée avec succés, afficher "2- Candidature en cours d'étude"
		//		Sinon afficher "2- La candidature ne peut pas être étudiée"
		// 3- ... puis afficher la candicature
		
		/* Votre code pour les questions 2 et 3 ici */
		
		System.out.println("[Question 2]-----\n\n");
		
		cdt1.etudier();
		
		
		System.out.println( "\n\n-----[Question 3]-----\n\n" ) ;
		
		
		System.out.println(cdt1);
		
		
		
		
		// 4- Afficher l'état de la candidature
		//		Si la candidature est en attente afficher "4- Candidature en attente."
		//		Si la candidature est en cours d'étude "4- Candidature en cours d'étude."
		//		Si la candidature est annulée "4- Candidature annulée."
		//		Si ...
		
		/* Votre code pour la question 4 ici */
		
		System.out.println( "\n\n-----[Question 4]-----\n\n" ) ;
		
		switch(cdt1.getEtat()){
		case 1 : 
			System.out.println("Candidature en attente");
			break;
			
		case 2 :
			System.out.println("Candidature en cours d'étude");
			break;
			
		case 3 :
			System.out.println("Candidature annulée");
			break;
		case 4 : 
			System.out.println("Candidature Rejetée");
			break;
			
		case 5 :
			System.out.println("Candidature Acceptée");
			break;
	}
		
		
		// 5- Accepter puis afficher la candidature
		
		/* Votre code pour la question 5 ici */
		
		System.out.println( "\n\n-----[Question 5]-----\n\n" ) ;
		
		cdt1.setEtat(4);
		System.out.println(cdt1);
		
		
		// 6- Afficher l'état de la candidature 
		//		(voir question 4)
		//		...

		/* Votre code pour la question 6 ici */
		
		System.out.println( "\n\n-----[Question 6]-----\n\n" ) ;
		
		switch(cdt1.getEtat()){
		case 1 : 
			System.out.println("Candidature en attente");
			break;
			
		case 2 :
			System.out.println("Candidature en cours d'étude");
			break;
			
		case 3 :
			System.out.println("Candidature annulée");
			break;
		case 4 : 
			System.out.println("Candidature Acceptée");
			break;
			
		case 5 :
			System.out.println("Candidature Rejetée");
			break;
	}
						
		
		// 7- Tenter d'annuler la candidature
		//		Si l'opération d'annulation est réalisée avec succès, afficher "7- Candidature annulée."
		//		Sinon afficher "7- Annulation refusée."
		// 8- ... puis afficher la candidature
		
		/* Votre code pour les questions 7 et 8 ici */
		
		System.out.println( "\n\n-----[Question 7]-----\n\n" ) ;
		
		cdt1.annuler();
		
		System.out.println( "\n\n-----[Question 8]-----\n\n" ) ;
		
		System.out.println( cdt1 ) ;
		
		
		// 9- Tenter de rejeter la candidature
		//		Si l'opération est réalisée avec succès, afficher "9- Candidature rejetée."
		//		Sinon afficher "9- Opération refusée."
		// 10- ... puis afficher la candidature
		
		/* Votre code pour les questions 9 et 10 ici */
		
		System.out.println( "\n\n-----[Question 9]-----\n\n" ) ;			
		
		cdt1.rejeter();
		
		System.out.println( "\n\n-----[Question 10]-----\n\n" ) ;
	
		System.out.println( cdt1 ) ;
	
		// 11- Tenter d'accepter la candidature
		//		Si l'opération est réalisée avec succès, afficher "11- Candidature acceptée."
		//		Sinon afficher "12- Opération refusée."
		// 12- ... puis afficher la candidature
		
		/* Votre code pour les questions 11 et 12 ici */
	
		System.out.println( "\n\n-----[Question 11]-----\n\n" ) ;
		
		cdt1.accepter();
		
		System.out.println( "\n\n-----[Question 12]-----\n\n" ) ;
		
		System.out.println( cdt1 ) ;
	}

}
