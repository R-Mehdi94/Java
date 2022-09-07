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

	
		
		series.add(new Serie(1,"Strangers Things"));
		series.get(0).getSaisons().add(new Saison(1,2016,1) );
		series.get(0).getSaisons().get(series.size()-1).getEpisodes().add(series.size()-1,new Episode(1,"La Disparition de Will Byers", 57,1));
		series.get(0).getSaisons().get(series.size()-1).getEpisodes().add(series.size()-1,new Episode(2,"La Barjot de Maple Street", 45,1));
		series.get(0).getSaisons().get(series.size()-1).getEpisodes().add(series.size()-1,new Episode(3,"Petit papa Noël", 44,1));

		series.get(0).getSaisons().add(new Saison(2,2017,1) );
		series.get(0).getSaisons().get(series.size()-1).getEpisodes().add(series.size()-1,new Episode(1,"MADMAX", 43,2));
		series.get(0).getSaisons().get(series.size()-1).getEpisodes().add(series.size()-1,new Episode(2,"Des bonbons ou un sort, espèce de taré", 45,2));

		
		series.get(0).getSaisons().add(new Saison(3,2019,1) );
		series.get(0).getSaisons().get(series.size()-1).getEpisodes().add(series.size()-1,new Episode(2,"Comme des rats", 47,3));
		
		
		series.add(series.size()-1,new Serie(2,"Elementary"));
		series.get(series.size()-1).getSaisons().add(new Saison(7,2019,2) );
		series.get(series.size()-1).getSaisons().get(series.size()-1).getEpisodes().add(series.size()-1,new Episode(1,"Beauté volée", 53,7));
		series.get(series.size()-1).getSaisons().get(series.size()-1).getEpisodes().add(series.size()-1,new Episode(5,"In vino veritas", 48,7));
		
		for(int i=0; i<series.size();i++) {
			System.out.println(series.get(i).getTitre() + "\n");
		}	
		
		System.out.println(series.size());

		System.out.println(series.get(0).getSaisons());

		
	}

}
