package fr.voxilud.AppCollaborateurs;

public class developpeur extends Collaborateur {

	private int soldeRtt;
	private int competence;
	
	public developpeur(String matricule, String nom, String prenom, int soldeRtt, int competence) {
		super(matricule, nom, prenom);
		this.soldeRtt = soldeRtt;
		this.competence = competence;
	}

	public int getSoldeRtt() {
		return soldeRtt;
	}

	public void setSoldeRtt(int soldeRtt) {
		this.soldeRtt = soldeRtt;
	}

	public int getCompetence() {
		return competence;
	}

	public void setCompetence(int competence) {
		this.competence = competence;
	}

	public String toString() {
		return super.toString() + "developpeur [soldeRtt=" + soldeRtt + ", competence=" + competence + "]";
	}
	
	public String toHtml() {
		return "<div id =" + this.getMatricule() + "class = developpeur> \n" +
			   "\t" + this.getPrenom() + " <strong> " + this.getNom().toUpperCase() + "</strong\n" +
			   "\t" + "Niveau de compétence :" + this.competence + "\n" +
			   "\t" + "RTT :" + this.soldeRtt + "heures \n" +
			   "</div>\n\n";
		}
	public void crediterRtt(int nbJours){
		this.soldeRtt += nbJours * 24;
	}
	
	public void debiterRtt(int nbJours){
		this.soldeRtt -= nbJours * 24;
	}
	
}


