package lacosRepeticao;

import java.util.Scanner;

public class lacoFor {
	// Faça um sistema que receba um numero do usuario e gere a tabuada daquele numero
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, incremento;
		
		System.out.println("Manda um numero ai meu bom: ");
		numero = entrada.nextInt();
		
		for(incremento = 0; incremento <= 10; incremento++) {
			System.out.println(numero + " * " + incremento + " = " + (numero * incremento));
		}

	}

}
