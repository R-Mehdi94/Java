package fr.voxilud.production;

import java.util.ArrayList;
import java.util.List;

public class ModeleLecteur {
	

	private  List<Lecteur> lecteurs = new ArrayList<Lecteur>();
	
	public List<Lecteur> getLecteurs() {
		return lecteurs;
	}

	
	public void ajouterLecteur(Lecteur lecteur) {
		this.lecteurs.add(lecteur);
	}
	
	private void peupler() {
		
		Oeuvre oeu15 = new Oeuvre(15, "Le sport des rois");
		Oeuvre oeu28 = new Oeuvre(28, "Nino dans la nuit");
		Oeuvre oeu58 = new Oeuvre(58, "L'empreinte");
		Oeuvre oeu77 = new Oeuvre(77, "La vallée");
		Oeuvre oeu82 = new Oeuvre(82, "Malgré nous...");
		Oeuvre oeu93 = new Oeuvre(93, "Histoire d'os");
		Oeuvre oeu17 = new Oeuvre(17, "Il était deux fois");
		
		AudioBook aud21 = new AudioBook(21,2300,oeu15);
		AudioBook aud37 = new AudioBook(37,4501,oeu28);
		AudioBook aud45 = new AudioBook(45,3020,oeu58);
		AudioBook aud49 = new AudioBook(49,1200,oeu15);
		AudioBook aud57 = new AudioBook(57,4501,oeu77);
		AudioBook aud85 = new AudioBook(85,201,oeu82);
		AudioBook aud88 = new AudioBook(88,3422,oeu93);
		AudioBook aud103 = new AudioBook(103,238,oeu17);


		Lecteur lec1 = new Lecteur(1,"DA SILVA","Antoine");
		Lecteur lec2 = new Lecteur(2,"GAVAT ","Laura");		
		Lecteur lec3 = new Lecteur(3,"THILLIEZ","Claire");
		
		lec1.ajouterAudio(aud21);
		lec1.ajouterAudio(aud37);
		lec1.ajouterAudio(aud45);
		
		lec2.ajouterAudio(aud49);
		lec2.ajouterAudio(aud57);
		
		lec3.ajouterAudio(aud85);
		lec3.ajouterAudio(aud88);
		lec3.ajouterAudio(aud103);
		
		((ModeleLecteur) lecteurs).ajouterLecteur(lec1);
		((ModeleLecteur) lecteurs).ajouterLecteur(lec2);
		((ModeleLecteur) lecteurs).ajouterLecteur(lec3);


	}
	
	@Override
	public String toString() {
		return "ModeleLecteur [lecteurs=" + lecteurs + "]";
	}

	public Lecteur getLecteur(int num) {
		for(int i=0; i<lecteurs.size();i++) {
			if(lecteurs.get(i).getNumero()==num) {
				return lecteurs.get(i);
			}
		}
		return null;
	}
	
	public int getMaxAudio() {
		for(int i=0; i<1;i++) {
			int a = lecteurs.get(i).getLesAudiobooks().size();
			System.out.println(a);
		}
	return 0;
	}
}
