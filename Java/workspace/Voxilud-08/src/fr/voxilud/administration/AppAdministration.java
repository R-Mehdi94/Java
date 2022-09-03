package fr.voxilud.administration;

public class AppAdministration {

	public static void main(String[] args) {
		
		/*System.out.println( "\n\n-----[Question 1]-----\n\n" ) ;*/
		

		utilisateur utilisateurs [] = {
			new Membre("ZAKI", "Selma", "s.zaki@gns.fr", "azerty", 0, false),
			new Moderateur("LEBRETON", "Jules", "j.lebreton@gmail.com", "azerty", 0 ,"jbreton", 33),
			new Moderateur("BA", "Béchir", "bechir.ba@gmail.com", "azerty", 1 ,"bba", 103),
			new Membre("CAMOIT", "Alexis", "a.camoit@gns.fr", "azerty", 0, true),
			new Membre("KARIM", "Lamia", "l.karim@gns.fr", "azerty", 1, false),
			new Moderateur("ESSAMAMI", "Hamza", "hamza.mami@gmail.com", "azerty", 0 ,"hessa", 8),
		};
		
		System.out.println( "\n\n-----[Question 2]-----\n\n" ) ;
		
		
		
		
		for(utilisateur uti : utilisateurs){
			System.out.println(uti.getNom()+ " " + uti.getPrenom());
		}
		
		
		
		
		System.out.println( "\n\n-----[Question 3]-----\n\n" ) ;
		
		int cpt = 0;
		for(utilisateur uti : utilisateurs){
			if(uti.getEtat() == 1){
				cpt +=1;	
			}
		}
		System.out.println(cpt);
		
		
		
		
		System.out.println( "\n\n-----[Question 4]-----\n\n" ) ;
		
		for(utilisateur uti : utilisateurs){
			uti.seDeconnecter();
			System.out.println(uti.getNom()+ " " + uti.getEtat());
		}
		
		
		
		
		System.out.println( "\n\n-----[Question 5]-----\n\n" ) ;
		
		for(utilisateur uti : utilisateurs){
			if(uti instanceof Moderateur){
				uti.seConnecter("jbreton","azerty");
				System.out.println(uti.getNom()+ " " + uti.getEtat());
				break;
			}
			
		}
		
		
		
		
		System.out.println( "\n\n-----[Question 6]-----\n\n" ) ;
		
		for(utilisateur uti : utilisateurs){
			if(uti instanceof Membre){
				uti.seConnecter("s.zaki@gns.fr", "azerty");
				System.out.println(uti.getNom()+ " " + uti.getEtat());
				break;
			}
			
		}
		
		
		
		
		System.out.println( "\n\n-----[Question 7]-----\n\n" ) ;
		
		for(utilisateur uti : utilisateurs){
			if(uti instanceof Moderateur){
				uti.seConnecter("jbreton","azerty");
				uti.seConnecter("bba","azerty");
				uti.seConnecter("hessa","azerty");
				System.out.println(uti.getNom()+ " " + uti.getEtat());
				
			}
			
			if(uti instanceof Membre){
				uti.seConnecter("s.zaki@gns.fr", "azerty");
				uti.seConnecter("a.camoit@gns.fr", "azerty");
				uti.seConnecter("l.karim@gns.fr", "azerty");
				System.out.println(uti.getNom()+ " " + uti.getEtat());
			}
		}
		
		
		
		
		System.out.println( "\n\n-----[Question 8]-----\n\n" ) ;
		
		for(utilisateur uti : utilisateurs){
			if(uti.getNom() == "LEBRETON"){
				for(utilisateur uti2 : utilisateurs){
					if(uti2.getNom() == "CAMOIT"){
						((Moderateur)uti).debloquer(((Membre)uti2));
						}
				}
			}	
		}
		
		
		for(utilisateur uti : utilisateurs){
			if(uti.getNom() == "CAMOIT"){
				uti.seConnecter("a.camoit@gns.fr", "azerty");
			}
		}	
			
			
			
		
		System.out.println( "\n\n-----[Question 9]-----\n\n" ) ;
		
		for(utilisateur uti : utilisateurs){
			if(uti.getNom() == "ESSAMAMI"){
				for(utilisateur uti2 : utilisateurs){
					if(uti2.getNom() == "ZAKI"){
						((Moderateur)uti).bloquer(((Membre)uti2));
						}
				}
			}	
		}
		
		
		for(utilisateur uti : utilisateurs){
			if(uti.getNom() == "ZAKI"){
				uti.seConnecter("s.zaki@gns.fr", "azerty");
			}
		}
		
		
		
		System.out.println( "\n\n-----[Question 10]-----\n\n" ) ;
		
		for(utilisateur uti : utilisateurs){
			if(uti.getNom() == "BA"){
				System.out.println(((Moderateur)uti).getNbAlertesEnvoyees());
				for(utilisateur uti2 : utilisateurs){
					if(uti2.getNom() == "KARIM"){
						((Moderateur)uti).alerter(((Membre)uti2), "limite injurieux");	
					}
				}
				
			}
		}
		
		for(utilisateur uti : utilisateurs){
			if(uti.getNom() == "BA"){
				System.out.println(((Moderateur)uti).getNbAlertesEnvoyees());
			}
		}
		
		for(utilisateur uti2 : utilisateurs){
			if(uti2.getNom() == "KARIM"){
				System.out.println(((Membre)uti2).visuNotif());
			}
		}
	}

}