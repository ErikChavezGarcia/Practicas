package practics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p1,p2,p3,subtotal=0,aumento,total;
		Scanner leer= new Scanner(System.in);
		int resp;
		System.out.println("Cuantos productos son");
		resp=leer.nextInt();
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		for (int i = 1; i<= resp; i++) {
			System.out.println("Introducir el valor del producto ");
			p1=leer.nextDouble();
			subtotal+=p1;
		}
		
		if (subtotal>1500) {
			aumento=subtotal*0.11;
		}
		else {
			aumento=subtotal*0.10;
		}
		total=subtotal+aumento;
		System.out.println("El valor total de los productos mas el aumento es: "+formateador.format(total));
		System.out.println("El aumento es: "+formateador.format(aumento));
	}

}
