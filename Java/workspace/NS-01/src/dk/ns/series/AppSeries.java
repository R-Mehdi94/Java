package dk.ns.series;

import java.util.ArrayList;
import java.util.List;

public class AppSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Acteur> acteurs = new ArrayList<Acteur>(); 
		
		Acteur act1 = new Acteur(1,"Winona","Ryder");
		Acteur act2 = new Acteur(2,"David","Harbour");
		Acteur act3 = new Acteur(3,"Finn","Wolfhard");

		acteurs.add(act1);
		acteurs.add(act2);
		acteurs.add(act3);
		
		for(int i=0; i<acteurs.size();i++) {
			System.out.println(acteurs.get(i));
		}
		
		System.out.println("\n");
		
		for(int i=0; i<acteurs.size();i++) {
			System.out.println(acteurs.get(i).getNom());
		}
		
		List<Serie> series = new ArrayList<Serie>();

		Episode ep1 = new Episode(1,"La Disparition de Will Byers", 57);
		
		Episode ep2 = new Episode(2,"La Barjot de Maple Street", 45);

		Episode ep3 = new Episode(3,"Petit papa Noël", 44);
		
		Saison sai1 = new Saison(1,2016);
		
		sai1.ajouterEpisode(ep1);
		sai1.ajouterEpisode(ep2);
		sai1.ajouterEpisode(ep3);
		
		series.add(sai1);

		

		
	}

}
