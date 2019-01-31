package practics;

import java.util.Scanner;

public class programa12B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nc,m,i = 0,cl=0,mas100=0,menos100=0;
		double cm,acum=0,prom;
		Scanner leer= new Scanner(System.in);
		System.out.println("Cuantos clientes son");
		nc=leer.nextInt();
		while (i!=nc) {	
			m=1;
			cl++;
			System.out.println("Hola cliente "+cl);
			do {
			System.out.println("Cual es el consumo en minutos en el mes "+m);
			cm=leer.nextDouble();	
			acum+=cm;
			if (cm>100) {
				mas100++;
			}
			else {
				if (cm<=100) {
					menos100++;
				}	
			}
			m++;
			}while (m!=13);
			
			i++;
			}
		
			prom=acum/nc;
		System.out.println("El total de minutos es: "+acum);
		System.out.println("El promedio de los minutos al año es: "+prom);
		System.out.println("Los meses que se consumieron mas de 100 minutos en "+mas100);
		System.out.println("Los meses que se consumieron menos de 100 minutos en "+menos100);

	
	}

}
