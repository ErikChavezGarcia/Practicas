package practics;

import java.util.Scanner;

public class programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ed;
		Scanner leer= new Scanner(System.in);
		System.out.println("Introducir su edad ");
		ed=leer.nextInt();
		if (ed>=18) {
			System.out.println("Mayor de edad");
		}
		else {
			System.out.println("Menor de edad");
		}
	}

}
