package dk.ns.series;

import java.util.ArrayList;
import java.util.List;


public class Saison {
	
	private int numSaison;
	private int annee;
	private List<Episode> episodes = new ArrayList<Episode>();
	
	public Saison(int numSaison, int annee) {
		this.numSaison = numSaison;
		this.annee=annee;
	}

	@Override
	public String toString() {
		return "Saison [numSaison=" + numSaison + ", annee=" + annee + "]";
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

}
