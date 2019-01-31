package practics;

import java.util.Scanner;

public class programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int nc;
		double cal,prom,acum=0;
		System.out.println("Cuantas calificaciones querie registrar");
		nc=leer.nextInt();
		for (int i = 0; i !=nc; i++) {
			System.out.println("Ingresar la calificacion");
			cal=leer.nextDouble();
			acum+=cal;
			
		}
		prom=acum/nc;
		if (prom>=0 & prom<=49) {
			System.out.println("Suspenso usted tiene un promedio de: "+prom);
			
		}
		else {
			if (prom>=50 & prom<=69) {
				System.out.println("Aprobado usted tiene un promedio de: "+prom);
			}
			else {
				if (prom>=70 & prom<=89) {
					System.out.println("Notable usted tiene un promedio de: "+prom);
					}
				else {
					if (prom>=90 & prom<=99) {
						System.out.println("Sobresaliente usted tiene un promedio de: "+prom);
						
				}
					else {
						if (prom==100) {
							System.out.println("Marticula de honor usted tiene un promedio de: "+prom);

						}
					}
			}
		}
	}

}
}