package practics;

import java.util.Scanner;

public class programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cal;
		Scanner leer= new Scanner(System.in);
		System.out.println("¿Cual es la calificacion de la materia?");
		cal=leer.nextInt();
		if (cal>=80) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprobado");
		}

		
	}

}
