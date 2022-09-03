package fr.voxilud.administration;

public abstract class utilisateur {
	public static final int CONNECTE = 1;
	public static final int DECONNECTE = 2;
	private String nom;
	private String prenom;
	protected String email;
	protected String mdp;
	private int etat = DECONNECTE;
	protected String msg;
	
	public utilisateur(String nom, String prenom, String email, String mdp, int etat){
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.etat = etat;
	}

	public abstract boolean seConnecter(String email,String mdp);
	
	public void seDeconnecter(){
		this.etat=DECONNECTE;
		}

	public String toString() {
		return "utilisateur [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", mdp=" + mdp + ", etat=" + etat
				+ "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}
}

	
