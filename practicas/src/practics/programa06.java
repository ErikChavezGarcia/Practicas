package practics;

import java.util.Scanner;

public class programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int num;
		System.out.println("Ingresar un numero:");
		num=leer.nextInt();
		if (num%2==0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
	}
	

}
//el operador �%� para calcular el �resto� de la divisi�n del n�mero �x� entre �2�. Si el n�mero tiene resto igual a cero sabemos que es par.
