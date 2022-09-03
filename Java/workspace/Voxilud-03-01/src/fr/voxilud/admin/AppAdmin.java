package fr.voxilud.admin;

public class AppAdmin {
	public static void main(String[] args) {
		
		Lecteur lecteur1 = new Lecteur(101 , "SANTERRE" , "Jean" , 20);
		
		System.out.println(lecteur1.toString() );
		
		System.out.println("Nom du lecteur numéro 101 : "+ lecteur1.getnom() );
		
		
		Lecteur lecteur2 = new Lecteur(102 , "NONATO" , "Isabella");
		
		System.out.println(lecteur2.toString() );
		
		System.out.println("Nom du lecteur numéro 102 : "+ lecteur2.getnom() );
		
		lecteur2.setnom(lecteur1.getnom());
		
		System.out.println("Nom du lecteur numéro 102 : "+ lecteur2.getnom() );
		
		if(lecteur1.estActif()){
			System.out.println("Lecteur actif");
		}
		else{
			System.out.println("Lecteur passif");
		}
		
		if(lecteur2.estActif()){
			System.out.println("Lecteur actif");
		}
		else{
			System.out.println("Lecteur passif");
			
		}
		
		System.out.println("Nombre d'audiobooks produits par le lecteur n° 101 : " + lecteur1.getaudiobooks());
		
		lecteur1.produireUnAudiobook();
		
		System.out.println("Nombre d'audiobooks produits par le lecteur n° 101 : " + lecteur1.getaudiobooks());
	
	}
}
	
	