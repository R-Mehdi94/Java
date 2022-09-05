package dk.ns.series;

import java.util.ArrayList;
import java.util.List;

public class Serie {
	
	private int idSerie;
	private String titre;
	private List<Saison> saisons = new ArrayList<Saison>();
	
	public Serie(int idSerie, String titre) {
		this.idSerie = idSerie;
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Serie [idSerie=" + idSerie + ", titre=" + titre + "]";
	}

	public int getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	
	public void ajouterSaison(Saison saison) {
		saisons.add(saison);
	}
	
	public List<Saison> getSaisons(){
		return saisons;
	}
	

}
