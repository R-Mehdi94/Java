package fr.voxilud.admin;

public class Oeuvre {
	protected int numero;
	protected String titre;
	protected int nbAudioBooks;
	public static final int NB_AUDIOBOOKS_MAX = 5 ; 
	
	public Oeuvre(int numero, String titre, int nbAudioBooks){
		this.numero = numero;
		this.titre = titre;
		this.nbAudioBooks = nbAudioBooks;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbAudioBooks() {
		return nbAudioBooks;
	}

	public void setNbAudioBooks(int nbAudioBooks) {
		this.nbAudioBooks = nbAudioBooks;
	}

	public static int getNbAudiobooksMax(){
			return NB_AUDIOBOOKS_MAX;
	}
	
	public String toString(){
		return "numero = " + numero + " titre = " + titre + " nbAudioBooks = " + nbAudioBooks;
	}
	
	public String toHTML(){
		if(nbAudioBooks < NB_AUDIOBOOKS_MAX){
			return "<div>" +  "\n"
					+ numero + " " + "(" + nbAudioBooks + " produits)"  + "\n"
					+ titre + "\n"
					+ "</div>";
		}
		else{
			return "<div>" +  "\n"
					+ numero + " " + "(<strong> Production bloquée </strong>)" + "\n"
					+ titre + "\n"
					+ "</div>";
		}
	}
	
}
