package practics;

import java.util.Scanner;

public class programa03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom;
		int ed;
		double est;
		Scanner leer= new Scanner(System.in);
		System.out.println("Introducir tu nombre");
		nom=leer.nextLine();
		System.out.println("Introducir tu edad");
		ed=leer.nextInt();
		System.out.println("Introducir tu estatura");
		est=leer.nextDouble();
		System.out.println("Hola "+nom+" Tu edad es "+ed+" Tu estatura es "+est);
	}

}
