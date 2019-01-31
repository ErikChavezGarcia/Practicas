package practics;

import java.util.Scanner;

public class programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grados, cent ;
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingresar valor en grados Fahrenheit");
		grados=leer.nextDouble();
		cent=(grados-32)/1.8;
		System.out.println(grados+" Fahrenheit es igual a "+cent+" Grados Centigrados");
		}

}
