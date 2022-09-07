package dk.ns.series;

public class Episode {
	
	private int numEpisode;
	private String titre;
	private int duree;
	private int numSaison;

	
	public Episode(int numEpisode, String titre, int duree, int numSaison) {
		this.numEpisode =numEpisode;
		this.titre = titre;
		this.duree = duree;
		this.numSaison = numSaison;
	}

	public int getNum() {
		return numEpisode;
	}

	public void setNum(int numEpisode) {
		this.numEpisode = numEpisode;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	

	@Override
	public String toString() {
		return "Episode [numEpisode=" + numEpisode + ", titre=" + titre + ", duree=" + duree + ", numSaison="
				+ numSaison + "]";
	}

	public int getNumSaison() {
		return numSaison;
	}

	public void setNumSaison(int numSaison) {
		this.numSaison = numSaison;
	}
	
	

}
