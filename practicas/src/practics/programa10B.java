package practics;

import java.util.Scanner;

public class programa10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int num, acum=0;
		double prom;
		do {
			System.out.println("Ingresar numeros menores que 76");
			num=leer.nextInt();
			acum+=num;
			
		} while (num<=76);
		prom=acum/num;
		System.out.println("El promedio es: "+prom);
	}

}
