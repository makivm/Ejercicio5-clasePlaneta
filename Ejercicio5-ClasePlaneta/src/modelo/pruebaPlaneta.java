package modelo;

import java.util.Scanner;

public class pruebaPlaneta {

	public static void main(String[] args) {
		// Creacion de los planetas y calculo de densidad y planeta exterior

		/*
		 * System.out.
		 * println("------------------------------------------------------------\n 			Planeta P2\n------------------------------------------------------------"
		 * ); Planeta p1=new
		 * Planeta("Urano",4,659424563,58944557,594631,489554,"US",true);
		 * System.out.println("Introduciendo planeta 1: \n"); System.out.println(p1);
		 * System.out.printf("\nLa densidad del planeta P1 es %.2f: kg/km3",p1.
		 * calculaDensidad());
		 * System.out.println("\nEs planeta exterior?: ** "+p1.planetaExterior()+" **");
		 * 
		 * 
		 * System.out.
		 * println("\n------------------------------------------------------------\n 			Planeta P2\n------------------------------------------------------------"
		 * ); Planeta p2=new
		 * Planeta("Mercurio",3,487956471,51665984,789456,569,"GASEOSO",false);
		 * System.out.println("Introduciendo planeta 2: \n"); System.out.println(p2);
		 * System.out.printf("\nLa densidad del planeta P2 es %.2f: kg/km3",p2.
		 * calculaDensidad());
		 * System.out.println("\nEs planeta exterior?: ** "+p2.planetaExterior()+" **");
		 * 
		 * System.out.
		 * println("\n------------------------------------------------------------\n 			Planeta P3\n------------------------------------------------------------"
		 * ); Planeta p3=new
		 * Planeta("Saturno",200,5.688E26,8.27E23,120536,1418,"GASEOSO",true);
		 * System.out.println("Introduciendo planeta 3: \n"); System.out.println(p3);
		 * System.out.printf("\nLa densidad del planeta P3 es %.2f: kg/km3",p3.
		 * calculaDensidad());
		 * System.out.println("\nEs planeta exterior?: ** "+p3.planetaExterior()+" **");
		 */

		// Comprobar sistema solar
		SistemaSolar sistema = new SistemaSolar("Sistema Solar");

		Planeta p4 = new Planeta("Marte", 200, 5.688E26, 8.27E23, 120536, 1418, "GASEOSO", true);

		System.out.println("Añadiendo Marte a la lista...");
		sistema.insertarPlaneta(p4);

		p4 = new Planeta("Mercurio", 3, 487956471, 51665984, 789456, 569, "GASEOSO", false);
		System.out.println("Añadiendo Mercurio a la lista...");
		sistema.insertarPlaneta(p4);

		p4 = new Planeta("Marte", 2, 54848, 516548944, 3151, 123, "GASEOSO", true);
		System.out.println("Añadiendo Marte a la lista...");
		sistema.insertarPlaneta(p4);// NO SE AÑADE PUESTO QUE YA EXISTE UN PLANETA CON ESTE NOMBRE Y HEMOS PUESTO EL
									// METODO EQUALS A PLANETA PARA CONTROLAR QUE, PARA INTRODUCIR EL PLANETA,NO
									// DEBE EXISTIR OTRO CON EL MISMO NOMBRE

		p4 = new Planeta("Saturno", 0, 3.302E23, 6.083E10, 4879, 57, "TERRESTRE", false);
		sistema.insertarPlaneta(p4);

		p4 = new Planeta("tierra", 1, 5.9736E24, 1.08321E12, 6371, 1, "TERRESTRE", false);
		sistema.insertarPlaneta(p4);

		System.out.println("Sistema solar: " + sistema);

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce nombre del planeta a buscar: ");
		String nombre = teclado.nextLine();

		Planeta buscar = new Planeta();
		buscar.setNombre(nombre);

		System.out.println(sistema.buscarPlaneta(buscar));

		System.out.println("El planeta mas denso es: " + sistema.planetaMasDenso());

		System.out.println("La masa media de los planetas de nuestro sistema es: " + sistema.pesoMedio() + " "
				+ sistema.masaMedia());

		teclado.close();
	}

}
