package practics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ne,cont=0;
		double isr,acum=0,total,sueldo,sma,smina;
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		Scanner leer= new Scanner(System.in);
		System.out.println("Introducir el numero de empleados:");
		ne=leer.nextInt();
		sma=0.3;
		smina=10000000000000000000000000.2;
		do {
			System.out.println("Introducir el sueldo del empleado");
			sueldo=leer.nextDouble();
			if (sueldo>sma) {
				sma=sueldo;
			}
			else {
				if (sueldo<smina) {
					smina=sueldo;
				}
			}
			acum+=sueldo;
			cont++;
		} while (ne!=cont);
		isr=acum*.33;
		total=acum-isr;
		System.out.println("El total a pagar entre todos los empleados es: "+total);
		System.out.println("El ISR es: "+isr);
		System.out.println("El sueldo mayor es: "+formateador.format(sma));
		System.out.println("El sueldo menor es: "+formateador.format(smina));
		
	}

}
