package practics;

import java.util.Scanner;

public class programa12A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int np,np200=0,np400=0;
		double precio,acum;
		Scanner leer= new Scanner(System.in);
		System.out.println("Cuantos productos son");
		np=leer.nextInt();
		for (int i = 1; i <= np; i++) {
			System.out.println("precio del Producto");
			precio=leer.nextDouble();
			if (precio>0 && precio<=200) {
				np200++;
			}
			if (precio>200 && precio<=400) {
				np400++;
			}
			
		}
		System.out.println("El numero de productos vendidos con precio de 200 o menor son: "+np200);
		System.out.println("El numero de productos vendidos con precio entre 400 y 200 es: "+np400);

	}

}
