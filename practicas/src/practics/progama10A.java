package practics;

import java.text.DecimalFormat;
import java.util.Scanner;

public class progama10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prod,aumento,total,acum=0;
		int cont=1, num;
		Scanner leer= new Scanner(System.in);
		
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		System.out.println("¿Cuantos productos son?");
		num=leer.nextInt();
		do {
			System.out.println("Introducir el valor del producto "+cont);
			prod=leer.nextDouble();
			acum+=prod;
			cont+=1; 
		} while (cont<=num);
		
		if (acum>1500) {
			aumento=acum*0.11;
		}
		else {
			aumento=acum*0.10;
		}
		total=acum+aumento;
		System.out.println("Los productos fueron "+formateador.format(num));
		System.out.println("El aumento es:"+formateador.format(aumento));
		System.out.println("El total es "+formateador.format(total));
	}

}
