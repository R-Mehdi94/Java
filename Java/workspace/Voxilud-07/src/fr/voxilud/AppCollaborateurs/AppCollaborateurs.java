package fr.voxilud.AppCollaborateurs;

public class AppCollaborateurs {

	public static void main(String[] args) {
		
		/*System.out.println( "\n\n-----[Question 1]-----\n\n" ) ;*/
		
		Collaborateur Collaborateurs [] = {	
			new ChefProjet("R289", "ZAKI", "Selma", 12 , 19),
			new developpeur("L518", "LEBRETON", "Jules", 33 , 3),
			new Collaborateur("C133", "BA", "Béchir"),
			new developpeur("L530", "WILMANN", "Florian", 28, 2),
			new developpeur("L541", "MACEDO", "Cody", 130, 5),
			new ChefProjet("C141", "CAMOIT", "Alexis", 15, 23)
		};
		
		System.out.println( "\n\n-----[Question 2]-----\n\n" ) ;
		
		for (Collaborateur col : Collaborateurs){
			System.out.println(col.getNom());
			System.out.println(col.getMatricule());
		}
		
		System.out.println( "\n\n-----[Question 3]-----\n\n" ) ;
		
		for (Collaborateur col : Collaborateurs){
			System.out.println(col.toHtml());
		}		
		
		System.out.println( "\n\n-----[Question 4]-----\n\n" ) ;
		
		for (Collaborateur col : Collaborateurs){
			System.out.println(col.toJson());
		}	
		
		System.out.println( "\n\n-----[Question 5]-----\n\n" ) ;
		
		for (Collaborateur col : Collaborateurs){
			if(col instanceof ChefProjet){
				System.out.println((( ChefProjet )col).getNbProjets());
			}
		}		
		
		/*System.out.println( "\n\n-----[Question 6]-----\n\n" ) ;*/
		
		for (Collaborateur col : Collaborateurs){
			if(col instanceof developpeur){
				((developpeur) col).crediterRtt(1);
			}
		}
		
		System.out.println( "\n\n-----[Question 7]-----\n\n" ) ;
		
		for (Collaborateur col : Collaborateurs){
			if(col instanceof developpeur){
				System.out.println((( developpeur )col).getSoldeRtt());
			}
		}
		
		/*System.out.println( "\n\n-----[Question 8]-----\n\n" ) ;*/
		
		for (Collaborateur col : Collaborateurs){
			if(col instanceof developpeur){
				((developpeur) col).debiterRtt(1);
			}
		}
		
		

	}
}
