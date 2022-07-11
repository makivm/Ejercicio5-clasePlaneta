package modelo;

public class pruebaPlaneta {

	public static void main(String[] args) {
		//Creacion de los planetas y calculo de densidad y planeta exterior
		
		System.out.println("------------------------------------------------------------\n 			Planeta P2\n------------------------------------------------------------");
		Planeta p1=new Planeta("Urano",4,659424563,58944557,594631,489554,"US",true);
		System.out.println("Introduciendo planeta 1: \n");
		System.out.println(p1);
		System.out.printf("\nLa densidad del planeta P1 es %.2f: kg/km3",p1.calculaDensidad());
		System.out.println("\nEs planeta exterior?: ** "+p1.planetaExterior()+" **");
		
		
		System.out.println("\n------------------------------------------------------------\n 			Planeta P2\n------------------------------------------------------------");
		Planeta p2=new Planeta("Mercurio",3,487956471,51665984,789456,569,"GASEOSO",false);
		System.out.println("Introduciendo planeta 2: \n");
		System.out.println(p2);
		System.out.printf("\nLa densidad del planeta P2 es %.2f: kg/km3",p2.calculaDensidad());
		System.out.println("\nEs planeta exterior?: ** "+p2.planetaExterior()+" **");
	}

}
