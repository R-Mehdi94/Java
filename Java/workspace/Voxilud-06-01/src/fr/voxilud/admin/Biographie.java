package fr.voxilud.admin;

public class Biographie extends Oeuvre {
	private String personnage;
	
	public Biographie (int numero, String titre, int nbAudioBooks, String personnage){
		super(numero,titre,nbAudioBooks);
		this.personnage = personnage;
	}

	
	public String toString() {
		return super.toString() + " personnage = " + personnage ;
	}

	public String getPersonnage() {
		return personnage;
	}

	public void setPersonnage(String personnage) {
		this.personnage = personnage;
	}
	
	public String toHTML(){
		if(nbAudioBooks < NB_AUDIOBOOKS_MAX){
			return "<div>" +  "\n"
					+ numero + ( + nbAudioBooks + " produits") + "\n"
					+ personnage + "\n"
					+ titre + "\n"
					+ "</div>";
		}
		else{
			return "<div>" +  "\n"
					+ numero + " " + "(<strong> Production bloquée </strong>)" + "\n"
					+ personnage + "\n"
					+ titre + "\n"
					+ "</div>";
		}
	}
}
