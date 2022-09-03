package fr.voxilud.admin;

public class AppAdmin {
	public static void main(String[] args) {
	
		/*System.out.println( "\n\n-----[Question 1]-----\n\n" ) ;*/
		Auteurs aut115 = new Auteurs(155, "SAND" , "Georges");
		
		
		
		System.out.println( "\n\n-----[Question 2]-----\n\n" ) ;
		System.out.println(aut115);
		
		
		
		System.out.println( "\n\n-----[Question 3]-----\n\n" ) ;
		System.out.println(aut115.getNom());
		
		
		
		/*System.out.println( "\n\n-----[Question 4]-----\n\n" ) ;*/
		Oeuvre oeuv35 = new Oeuvre(35, "Indiana", aut115);
		
		
		
		System.out.println( "\n\n-----[Question 5]-----\n\n" ) ;
		System.out.println(oeuv35);
		
		
		
		System.out.println( "\n\n-----[Question 6]-----\n\n" ) ;
		System.out.println(oeuv35.getTitre());
		
		
		
		System.out.println( "\n\n-----[Question 7]-----\n\n" ) ;
		System.out.println(oeuv35.getAuteur());
		
		
		
		System.out.println( "\n\n-----[Question 8]-----\n\n" ) ;
		System.out.println(oeuv35.getAuteur().getNom());
		
		
		
		/*System.out.println( "\n\n-----[Question 9]-----\n\n" ) ;*/
		AudioBooks audio235 = new AudioBooks(235, "Francais", oeuv35);
		
		
		
		System.out.println( "\n\n-----[Question 10]-----\n\n" ) ;
		System.out.println(audio235);
		
		

		System.out.println( "\n\n-----[Question 11]-----\n\n" ) ;
		System.out.println(audio235.getOeuvre());
		
		
		
		System.out.println( "\n\n-----[Question 12]-----\n\n" ) ;
		System.out.println(audio235.getOeuvre().getTitre());
		
		
		
		System.out.println( "\n\n-----[Question 13]-----\n\n" ) ;
		System.out.println(audio235.getOeuvre().getAuteur());
		
		
		
		System.out.println( "\n\n-----[Question 14]-----\n\n" ) ;
		System.out.println(audio235.getOeuvre().getAuteur().getNom());
		
		
		
		/*System.out.println( "\n\n-----[Question 15]-----\n\n" ) ;*/
		
		Auteurs aut111 = new Auteurs(111, "DE MAUPASSANT", "Guy");
		Auteurs aut112 = new Auteurs(112, "DUMAS", "Alexandre");
		Auteurs aut113 = new Auteurs(113, "CAMUS", "Albert");
		Auteurs aut114 = new Auteurs(114, "BARJAVEL", "René");	
		
		Auteurs [] auteurs = { aut111, aut112, aut113, aut114					
		};
		
		
		
		System.out.println( "\n\n-----[Question 16]-----\n\n" ) ;
		for( Auteurs unAuteur : auteurs ){
			System.out.println(unAuteur.getNom() +" "+  unAuteur.getPrenom() );
		}
		
		
		
		System.out.println( "\n\n-----[Question 17]-----\n\n" ) ;
		System.out.println(aut113.getNom() +" "+ aut113.getPrenom());
		
		
		
		/*System.out.println( "\n\n-----[Question 18]-----\n\n" ) ;*/
		
		Oeuvre oeuv28 = new Oeuvre(28, "La Reine Margot", aut112);
		Oeuvre oeuv31 = new Oeuvre(31, "Bel Ami", aut111);
		Oeuvre oeuv32 = new Oeuvre(32, "Chanson de Roland");
		Oeuvre oeuv33 = new Oeuvre(33, "Pauline", aut112);
		
		Oeuvre[] oeuvres = { oeuv28, oeuv31, oeuv32, oeuv33
		};
		
		
		
		
		System.out.println( "\n\n-----[Question 19]-----\n\n" ) ;
		int cpt = 0;
		for(Oeuvre uneOeuvre : oeuvres){
			if(uneOeuvre.aUnAuteur() == false){
				cpt += 1;
			}
		}
		System.out.println(cpt) ;
		
		
	}
}

