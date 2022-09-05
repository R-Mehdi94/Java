package dk.ns.series;

public class Acteur {
	private int idActeur;
	private String nom;
	private String prenom;
	
	public Acteur(int idActeur, String nom, String prenom) {
		this.idActeur=idActeur;
		this.nom=nom;
		this.prenom=prenom;
	}

	public int getIdActeur() {
		return idActeur;
	}

	public void setIdActeur(int idActeur) {
		this.idActeur = idActeur;
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

	@Override
	public String toString() {
		return "Acteur [idActeur=" + idActeur + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
