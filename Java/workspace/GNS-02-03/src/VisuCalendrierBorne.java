
public class VisuCalendrierBorne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFr dateDebut;
		DateFr dateFin;
		DateFr uneDate;
		
		dateDebut = new DateFr (1 , 2 , 2022);
		dateFin = new DateFr(1, 4, 2022);
		uneDate = dateDebut;
		
		while(uneDate.estAnterieure(dateFin)){
			System.out.println(uneDate.enChaine() );
			uneDate.repousser(1); 
		}
	}

}
