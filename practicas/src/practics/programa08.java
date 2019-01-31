package practics;

import java.util.Scanner;

public class programa08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner leer= new Scanner(System.in);
		System.out.println("Introducir el numero de el dia de la semana");
		num=leer.nextInt();
		switch (num) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("El valor tine que ser de el 1 al 7");
			break;
		}
	}

}
