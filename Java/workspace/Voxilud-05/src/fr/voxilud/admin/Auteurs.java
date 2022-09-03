package fr.voxilud.admin;

public class Auteurs {
	private int idAuteurs = 0;
	private String nom = "";
	private String prenom = "";
	

	public Auteurs(int idAuteurs , String nom, String prenom){
		this.setIdAuteurs(idAuteurs);
		this.setNom(nom);
		this.setPrenom(prenom);
	}

	public int getIdAuteurs() {
		return idAuteurs;
	}

	public void setIdAuteurs(int idAuteurs) {
		this.idAuteurs = idAuteurs;
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
	
	public String toString(){
		return "Auteurs[" + idAuteurs + "," + nom + "," + prenom + "]" ;
	}
	
	
}
