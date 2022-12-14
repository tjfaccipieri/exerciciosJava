package primeiroProjeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		float nota1, nota2, nota3, media;
		
		System.out.println("Valor da nota 1, numeros positivos apenas: ");
		nota1 = entrada.nextFloat() * 2;
		
		System.out.println("Valor da nota 2, numeros positivos apenas: ");
		nota2 = entrada.nextFloat() * 3;
		
		System.out.println("Valor da nota 3, numeros positivos apenas: ");
		nota3 = entrada.nextFloat() * 5;
		
		media = ((nota1 + nota2 + nota3) / 10);
		
		System.out.println("A media das notas foi: " + decimal.format(media));
		
	}

}
