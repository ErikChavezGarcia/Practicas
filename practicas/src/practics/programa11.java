package practics;

import java.util.Scanner;

public class programa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fn;
		double con, res, pulg=0.393701, pie=30.48, pp=12;
		Scanner leer= new Scanner(System.in);
		do {
			System.out.println("1: Convercion centimetros a pulgadas");
			System.out.println("2: Convercion Pies a Centimetros");
			System.out.println("3: Convercion Pies a pulgadas");
			System.out.println("4: Salir");
			System.out.println("Seleccione uno (Numeros)");
			fn=leer.nextInt();
			switch (fn) {
			case 1:
				System.out.println("I;ntrodusca el valor en centimetros ");
				con=leer.nextDouble();
				res=con*pulg;
				System.out.println("El valor en pulgadas es: "+res);
				break;
			case 2:
				System.out.println("Introdusca el valor en pies ");
				con=leer.nextDouble();
				res=con*pie;
				System.out.println("El valor en centimetros es "+res);
				break;
			case 3:
				System.out.println("I;ntrodusca el valor en Pies ");
				con=leer.nextDouble();
				res=con*pp;
				System.out.println("El valor en pulgadas es "+res);
				break;
			case 4: 
				fn=4;
				System.out.println("Adios");
				break;
			default:
				System.out.println("El numero debe ser del 1 al 4");
				break;
			}
		} while (fn!=4);
	}

}
