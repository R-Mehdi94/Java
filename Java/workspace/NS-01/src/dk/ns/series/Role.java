package dk.ns.series;

import java.util.ArrayList;
import java.util.List;

public class Role {
	
	private String nom;
	private String prenom;
	private List<Serie> series = new ArrayList<Serie>() ;
	private Acteur acteur;
	
	public Role(String nom, String prenom, Acteur acteur) {
		this.nom = nom;
		this.prenom = prenom;
		this.acteur = acteur;
	}

	public String toString() {
		return "Role [nom=" + nom + ", prenom=" + prenom + ", Serie=" + series + ", Acteur=" + acteur + "]";
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

	public List<Serie> getSerie() {
		return series;
	}

	public void getSerie(Serie serie) {
		series.add(serie);
	}

	public Acteur getActeur() {
		return acteur;
	}

	public void setActeur(Acteur acteur) {
		this.acteur = acteur;
	}

}
