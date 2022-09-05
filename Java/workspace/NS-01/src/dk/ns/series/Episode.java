package dk.ns.series;

public class Episode {
	
	private int numEpisode;
	private String titre;
	private int duree;

	
	public Episode(int numEpisode, String titre, int duree) {
		this.numEpisode =numEpisode;
		this.titre = titre;
		this.duree = duree;
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
		return "Episode [num=" + numEpisode + ", titre=" + titre + ", duree=" + duree + "]";
	}
	
	

}
