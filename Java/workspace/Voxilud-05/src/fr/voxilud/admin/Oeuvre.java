package fr.voxilud.admin;

public class Oeuvre {
	private int idOeuvre;
	private String titre;
	private Auteurs auteur;
	
	
	public Oeuvre(int idOeuvre, String titre){
		this.setIdOeuvre(idOeuvre);
		this.setTitre(titre);
	}
	
	
	public Oeuvre(int idOeuvre, String titre, Auteurs auteur){
		this.setIdOeuvre(idOeuvre);
		this.setTitre(titre);
		this.setAuteur(auteur);
	}

	public int getIdOeuvre() {
		return idOeuvre;
	}

	public void setIdOeuvre(int idOeuvre) {
		this.idOeuvre = idOeuvre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Auteurs getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteurs auteur) {
		this.auteur = auteur;
	}
	
	public boolean aUnAuteur(){
		if (this.auteur == null){
			return false;
		}
		else{
			return true;
		}
	}
	
	
	public String toString(){
		return "Oeuvre[" + idOeuvre + "," + titre + "," + auteur + "]";
	}
}
