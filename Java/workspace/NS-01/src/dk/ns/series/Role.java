package dk.ns.series;

public class Role {
	
	private String nom;
	private String prenom;
	private int idSerie;
	private int idActeur;
	
	public Role(String nom, String prenom, int idSerie, int idActeur) {
		this.nom = nom;
		this.prenom = prenom;
		this.idSerie = idSerie;
		this.idActeur = idActeur;
	}

	public String toString() {
		return "Role [nom=" + nom + ", prenom=" + prenom + ", idSerie=" + idSerie + ", idActeur=" + idActeur + "]";
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

	public int getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	public int getIdActeur() {
		return idActeur;
	}

	public void setIdActeur(int idActeur) {
		this.idActeur = idActeur;
	}

}
