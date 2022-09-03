package fr.voxilud.AppCollaborateurs;

public class Collaborateur {
	private String matricule;
	private String nom;
	private String prenom;
	
	public Collaborateur(String matricule, String nom, String prenom) {
		this.setMatricule(matricule);
		this.setNom(nom);
		this.setPrenom(prenom);
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
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

	public String toString() {
		return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	public String toJson(){
		return  "matricule : " + this.matricule + ",\n" +
				"nom : " + this.nom + ",\n" +
				"prenom : " + this.prenom + "\n" ;
		}

	public String toHtml(){
		 return  "<div id =" + this.matricule + "class = collaborateur> \n" +
				 "\t" + this.prenom + " <strong> " + this.nom.toUpperCase() + "</strong\n" +
				 "</div>\n\n";
		
	
	}
	

}
