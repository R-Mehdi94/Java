package fr.voxilud.admin;

public class AppAdmin {

	public static void main(String[] args) {
	
		
		Oeuvre oeuvre103 = new Oeuvre(103 , "Le Crépuscule et l'Aube");
		
		System.out.println(oeuvre103);
		
		
		
		System.out.println( "\n\n-----[Question 6-a]-----\n\n" ) ;
		
		System.out.println(Oeuvre.getNbOeuvre());
		
		
		
		/*System.out.println( "\n\n-----[Question 6-b]-----\n\n" ) ;*/
		
		Oeuvre oeuvre302 = new Oeuvre(302 , "Nature Humaine");
		
		
		
		System.out.println( "\n\n-----[Question 6-c]-----\n\n" ) ;
		
		System.out.println(Oeuvre.getNbOeuvre());
		
		
/*System.out.println( "\n\n-----[Question 6-d]-----\n\n" ) ;*/
		
		Oeuvre oeuvre318 = new Oeuvre(318 , "L'Anomalie");
		
		
		
		System.out.println( "\n\n-----[Question 6-e]-----\n\n" ) ;
		
		System.out.println(Oeuvre.getNbOeuvre());
		
		
		System.out.println( "\n\n-----[Question 6-f]-----\n\n" ) ;
		
		System.out.println(oeuvre103.getNbOeuvre());
	}

}
