package practics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p1,p2,p3,subtotal,aumento,total;
		Scanner leer= new Scanner(System.in);

		DecimalFormat formateador = new DecimalFormat("###,###.##");
		System.out.println("Introducir el valor del producto 1");
		p1=leer.nextDouble();
		System.out.println("Introducir el valor del producto 2");
		p2=leer.nextDouble();
		System.out.println("Introducir el valor del producto 3");
		p3=leer.nextDouble();
		subtotal=p1+p2+p3;
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
