package fr.voxilud.production;

import java.util.ArrayList;
import java.util.List;

public class Lecteur {
	
	private int numero;
	private String nom;
	private String prenom;
	private List<AudioBook> lesAudiobooks = new ArrayList<AudioBook>();
	
	public Lecteur(int numero, String nom, String prenom) {
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
	}
		
		
	public void ajouterAudio(AudioBook audio) {
		lesAudiobooks.add(audio);
	}
	
	public AudioBook rechercherAudio(int num) {
		for(int i=0; i<lesAudiobooks.size(); i++) {
			if(lesAudiobooks.get(i).getNumero() == num) {
				System.out.println(lesAudiobooks.get(i));
				return lesAudiobooks.get(i);
			}	
		}
	
		return null;
		
	}
	
	public boolean supprimerAudio(int num){
				
		for(int i=0; i<lesAudiobooks.size(); i++){
			if(lesAudiobooks.get(i).getNumero() == num) {
				lesAudiobooks.remove(i);
				return true;
			}

		}
		return false;
	}
		
	
	
	public boolean supprimerAudio(AudioBook audioBook) {
		
		for(int i=0; i<lesAudiobooks.size(); i++){
			if(lesAudiobooks.get(i) == audioBook) {
				lesAudiobooks.remove(i);
				return true;
			}

		}
		return false;
	}
	
	
	public List<AudioBook> getLesAudiobooks() {
		return lesAudiobooks;
	}

	
	public void ajouterAudioBook(AudioBook unAudiobook) {
		this.lesAudiobooks.add(unAudiobook);
	}
	


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


}
