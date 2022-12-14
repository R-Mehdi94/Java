package fr.voxilud.production;

import java.lang.reflect.Method;

public class AppProduction {

	public static void main(String[] args) {
		
		/*System.out.println( "\n\n-----[Question 1]-----\n\n" ) ;*/
		
		Lecteur lec1 = new Lecteur(1,"DOS SANTOS", "Antoine");


		
		/*System.out.println( "\n\n-----[Question 2]-----\n\n" ) ;*/

		System.out.println(lec1.getLesAudiobooks()+"\n");
		

		
		/*System.out.println( "\n\n-----[Question 3]-----\n\n" ) ;*/
		
		Oeuvre oeu1 = new Oeuvre(15,"Le sport des rois");
		
		AudioBook aud1 = new AudioBook(21, 2300, oeu1);
		
		Oeuvre oeu2 = new Oeuvre(28,"Nino dans la nuit");
		
		AudioBook aud2 = new AudioBook(37, 4501, oeu2);
		
		Oeuvre oeu3 = new Oeuvre(58,"L'empreinte");
		
		AudioBook aud3 = new AudioBook(45, 3020, oeu3);
		
		lec1.ajouterAudio(aud1);
		
		lec1.ajouterAudio(aud2);
		
		lec1.ajouterAudio(aud3);
		
		
		
		/*System.out.println( "\n\n-----[Question 4]-----\n\n" ) ;*/
		
		System.out.println(lec1.getLesAudiobooks()+"\n");
		
		
		
		/*System.out.println( "\n\n-----[Question 5]-----\n\n" ) ;*/
		
		for(int i=0; i<lec1.getLesAudiobooks().size(); i++) {
			System.out.println(lec1.getLesAudiobooks().get(i).getOeuvre().getTitre());

		}
		
		System.out.println("\n");
		
		
		
		/*System.out.println( "\n\n-----[Question 6]-----\n\n" ) ;*/
		
		lec1.rechercherAudio(37);
		
		
		
		/*System.out.println( "\n\n-----[Question 7]-----\n\n" ) ;*/
		
		lec1.rechercherAudio(201);
		
		
		
		/*System.out.println( "\n\n-----[Question 8]-----\n\n" ) ;*/
		
		lec1.supprimerAudio(231);
		
		
		/*System.out.println( "\n\n-----[Question 9]-----\n\n" ) ;*/

		System.out.println(lec1.getLesAudiobooks()+"\n");
		
		
		
		/*System.out.println( "\n\n-----[Question 10]-----\n\n" ) ;*/
		
		lec1.supprimerAudio(37);
		
		
		/*System.out.println( "\n\n-----[Question 11]-----\n\n" ) ;*/

		System.out.println(lec1.getLesAudiobooks()+"\n");
		
		
		
		System.out.println( "\n\n-----[Question 12]-----\n\n" ) ;
		
		AudioBook aud4 = new AudioBook(21, 2033,oeu1);
		
		
		
		System.out.println( "\n\n-----[Question 13]-----\n\n" ) ;
		
		lec1.ajouterAudio(aud4);
		
		lec1.supprimerAudio(aud4);

		
		System.out.println( "\n\n-----[Question 14]-----\n\n" ) ;
		
		System.out.println(lec1.getLesAudiobooks()+"\n");

		
		System.out.println( "\n\n-----[Question 15]-----\n\n" ) ;

		AudioBook ab45 = lec1.getLesAudiobooks().get(1);
		
		
		System.out.println( "\n\n-----[Question 16]-----\n\n" ) ;

		lec1.supprimerAudio(ab45);
		
		System.out.println( "\n\n-----[Question 17]-----\n\n" ) ;


		System.out.println(lec1.getLesAudiobooks()+"\n");
		
		ModeleLecteur test = new ModeleLecteur();
		
		
		
		System.out.println(test);
		
		

	}

}
