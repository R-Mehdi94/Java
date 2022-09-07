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
		
		
		System.out.println("///////////////////////////////" + "\n");

		
		for(int i=0; i<acteurs.size();i++) {
			System.out.println(acteurs.get(i).getNom());
		}
		
		System.out.println("///////////////////////////////" + "\n");

		
		List<Serie> series = new ArrayList<Serie>();
		

	
		
		series.add(new Serie(1,"Strangers Things"));
		
		series.get(0).getSaisons().add(new Saison(1,2016,1) );
	
		series.get(0).getSaisons().get(0).getEpisodes().add(new Episode(1,"La Disparition de Will Byers", 57,1));
		series.get(0).getSaisons().get(0).getEpisodes().add(new Episode(2,"La Barjot de Maple Street", 45,1));
		series.get(0).getSaisons().get(0).getEpisodes().add(new Episode(3,"Petit papa Noël", 44,1));

		series.get(0).getSaisons().add(new Saison(2,2017,1) );
		series.get(0).getSaisons().get(1).getEpisodes().add(new Episode(1,"MADMAX", 43,2));
		series.get(0).getSaisons().get(1).getEpisodes().add(new Episode(2,"Des bonbons ou un sort, espèce de taré", 59,2));

		series.get(0).getSaisons().add(new Saison(3,2019,1) );
		series.get(0).getSaisons().get(2).getEpisodes().add(new Episode(2,"Comme des rats", 47,3));
		
		
		
		
		
		series.add(new Serie(2,"Elementary"));

		series.get(1).getSaisons().add(new Saison(7,2019,2) );
		

		series.get(1).getSaisons().get(0).getEpisodes().add(new Episode(1,"Beauté volée", 53,7));
		series.get(1).getSaisons().get(0).getEpisodes().add(new Episode(5,"In vino veritas", 48,7));
		
		
		for(int i=0; i<series.size();i++) {
			System.out.println(series.get(i).getTitre() + "\n");
			System.out.println(series.get(i).getSaisons().size());

		}	
		
		System.out.println("///////////////////////////////" + "\n");

		
		for(int i=0; i<series.get(0).getSaisons().get(1).getEpisodes().size();i++) {
			System.out.println(series.get(0).getSaisons().get(1).getEpisodes().get(i).getTitre() + "\n");
			System.out.println(series.get(0).getSaisons().get(1).getEpisodes().get(i).getDuree() + "\n");
		}	
		
		System.out.println("///////////////////////////////" + "\n");

		
		for(int i=0; i<series.get(0).getSaisons().size();i++) {
			for(int n=0; n<series.get(0).getSaisons().get(i).getEpisodes().size();n++) {
				System.out.println(series.get(0).getSaisons().get(i).getEpisodes().get(n).getTitre() + "\n");
				System.out.println(series.get(0).getSaisons().get(i).getEpisodes().get(n).getDuree() + "\n");
			}
		}	
		System.out.println("///////////////////////////////" + "\n");

		
		for(int i=0; i<series.size();i++) {
			for(int n=0; n<series.get(i).getSaisons().size();n++) {
				for(int y=0; y<series.get(i).getSaisons().get(n).getEpisodes().size();y++) {
					System.out.println(series.get(i).getSaisons().get(n).getEpisodes().get(y).getTitre() + "\n");
					System.out.println(series.get(i).getSaisons().get(n).getEpisodes().get(y).getDuree() + "\n");
					System.out.println(series.get(i).getSaisons().get(n).getAnnee() + "\n");
					
				}

				
			}
		}	
		
		System.out.println("///////////////////////////////" + "\n");


		
		for(int i=0; i<series.size();i++) {
			for(int n=0; n<series.get(0).getSaisons().get(i).getEpisodes().size();n++) {
				System.out.println(series.get(i).getSaisons().get(0).getEpisodes().get(n).getTitre() + "\n");
			}
		}
		
		System.out.println("///////////////////////////////" + "\n");


		int total =0;

		for(int i=0; i<series.get(0).getSaisons().size();i++) {
			System.out.println(series.get(0).getSaisons().get(i).getNumSaison());
		}
		
		for(int i=0; i<series.get(0).getSaisons().size();i++) {
			for(int n=0; n<series.get(0).getSaisons().get(i).getEpisodes().size();n++) {
				total+=series.get(0).getSaisons().get(i).getEpisodes().get(n).getDuree() ;
			}
		}
		
		

		
		System.out.println(total);
		
		System.out.println("///////////////////////////////" + "\n");

		

		int a =0;
		int numSaison = 0;
		String nomSerie = "";
		for(int i=0; i<series.size();i++) {
			for(int n=0; n<series.get(i).getSaisons().size();n++) {
				for(int y=0; y<series.get(i).getSaisons().get(n).getEpisodes().size();y++) {
					if(a<series.get(i).getSaisons().get(n).getEpisodes().get(y).getDuree()) {
						a = series.get(i).getSaisons().get(n).getEpisodes().get(y).getDuree();
						numSaison = series.get(i).getSaisons().get(n).getNumSaison();
						nomSerie = series.get(i).getTitre();
					}
					
				}

				
			}
		}	
		
		System.out.println(a);
		System.out.println(numSaison);
		System.out.println(nomSerie);
		
		System.out.println("///////////////////////////////" + "\n");


		List<Role> roles = new ArrayList<Role>();
		
		roles.add(new Role("Winona","Ryder", new Acteur(1,"Joyce","Byers")));
		roles.get(0).getSerie().add(new Serie(1,"Strangers Things"));

		
		roles.add(new Role("David","Harbour", new Acteur(2,"Jim","Hopper")));
		roles.get(1).getSerie().add(new Serie(1,"Strangers Things"));
		
		
		roles.add(new Role("David","Harbour", new Acteur(1,"Mason","Baldwin")));
		roles.get(1).getSerie().add(new Serie(2,"Elementary"));
		

		roles.add(new Role("Finn","Wolfhard", new Acteur(3,"Mike","Wheeler")));
		roles.get(1).getSerie().add(new Serie(1,"Strangers Things"));

		for(int i=0;i<roles.size();i++) {
			System.out.println(roles.get(i).getNom() + "" + roles.get(i).getPrenom());
		}
		
		System.out.println("///////////////////////////////" + "\n");

		
		for(int i=0;i<roles.size();i++) {
			for(int n=0;n<roles.get(i).getSerie().size();n++) {
				System.out.println(roles.get(i).getNom() + " " + roles.get(i).getPrenom());
				System.out.println(roles.get(i).getSerie().get(n).getTitre());
				System.out.println(roles.get(i).getActeur().getNom()+ " " + roles.get(i).getActeur().getPrenom() );
			}	
			
		}
		
		System.out.println("///////////////////////////////" + "\n");

		for(int i=0;i<3;i++) {
			//System.out.println(roles.get(i).getSerie()..getTitre());
		}


		

		
	}

}
