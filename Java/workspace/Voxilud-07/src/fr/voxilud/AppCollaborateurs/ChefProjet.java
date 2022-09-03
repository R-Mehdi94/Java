package fr.voxilud.AppCollaborateurs;

public class ChefProjet extends Collaborateur {
	private int experience;
	private int nbProjets;
	
	public ChefProjet(String matricule, String nom, String prenom, int experience, int nbProjets) {
		super(matricule, nom, prenom);
		this.experience = experience;
		this.nbProjets = nbProjets;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getNbProjets() {
		return nbProjets;
	}

	public void setNbProjets(int nbProjets) {
		this.nbProjets = nbProjets;
	}

	public String toJson(){
		return super.toJson() + "experience : " + this.experience + ",\n" +
				"nbProjets : " + this.nbProjets + "\n\n" ;
	}
	
	public String toHtml(){
		return "<div id =" + this.getMatricule() + "class = chefProjet> \n" +
				"\t" + this.getPrenom() + " <strong> " + this.getNom().toUpperCase() + "</strong\n" +
				"\t" + "Expérience :" + this.experience + "ans\n" +
				"\t" + "RTT :" + this.nbProjets + "\n" +
			   "</div>\n\n";
		
	}
	
	public String toString() {
		return super.toString() + "ChefProjet [experience=" + experience + ", nbProjets=" + nbProjets + "]";
	}
	
	public void enregistrerProjet(){
		this.nbProjets += 1;
	}
	
	
	

}
