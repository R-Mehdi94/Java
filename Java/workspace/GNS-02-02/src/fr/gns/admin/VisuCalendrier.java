package fr.gns.admin;

public class VisuCalendrier {

	public static void main(String[] args) {

	
	DateFr uneDate = new DateFr();
	 
	for(int i = 0;i<30;i=i+1){
		int u=0;
        u=u+1;
		System.out.println(uneDate.enChaine() );
		
		uneDate.repousser(1); 
		
	}
	
	

	}

}
