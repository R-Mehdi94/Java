package dk.ns.series;

import java.util.ArrayList;
import java.util.List;


public class Saison {
	
	private int numSaison;
	private int annee;
	private int idSerie;
	private List<Episode> episodes = new ArrayList<Episode>();
	
	public Saison(int numSaison, int annee,int idSerie) {
		this.numSaison = numSaison;
		this.annee=annee;
		this.idSerie=idSerie;
	}

	

	@Override
	public String toString() {
		return "Saison [numSaison=" + numSaison + ", annee=" + annee + ", idSerie=" + idSerie + ", episodes=" + episodes
				+ "]";
	}



	public int getNumSaison() {
		return numSaison;
	}

	public void setNumSaison(int numSaison) {
		this.numSaison = numSaison;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public void ajouterEpisode(Episode episode) {
		episodes.add(episode);
	}
	
	public List<Episode> getEpisodes(){
		return episodes;
	}

	public int getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

}
