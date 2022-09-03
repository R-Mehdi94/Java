
public class VisuJoursOuvrables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFr dateDebut;
		DateFr dateFin;
		DateFr uneDate;
		dateDebut = new DateFr(1, 2, 2022);
		dateFin = new DateFr(1, 4, 2022);
		uneDate = dateDebut;
		
		while(uneDate.estAnterieure(dateFin)){
			if(uneDate.getJour()!=6 && uneDate.getJour()!=7){
				System.out.println(uneDate.enChaine() );
			}
			else if(uneDate.getJour()==6)
				System.out.println(" ");
			uneDate.repousser(1); 
		}
	}

}
