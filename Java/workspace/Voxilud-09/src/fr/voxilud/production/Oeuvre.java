package fr.voxilud.production;

public class Oeuvre {
	
	private int numero ;
	private String titre;
	
	
	public Oeuvre(int numero, String titre) {
		this.numero = numero;
		this.titre = titre;
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
	
	
	public String toString() {
		return "Oeuvre [numero=" + numero + ", titre=" + titre + "]";
	}


}
