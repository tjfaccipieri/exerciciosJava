package primeiroProjeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		double x1, x2, y1, y2, distancia, raiz;
		
		System.out.println("Entre com o valor da coordenada X1:");
		x1 = entrada.nextFloat();
		
		System.out.println("Entre com o valor da coordenada Y1:");
		y1 = entrada.nextFloat();
		
		System.out.println("Entre com o valor da coordenada X2:");
		x2 = entrada.nextFloat();
		
		System.out.println("Entre com o valor da coordenada Y2:");
		y2 = entrada.nextFloat();
		
		distancia = (Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2));
		raiz = Math.sqrt(distancia);

		System.out.println("A distancia entre os pontos é de: " + decimal.format(raiz));
	}

}
