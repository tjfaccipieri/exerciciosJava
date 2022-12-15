package lacosRepeticao;

import java.util.Scanner;

public class lacoWhile {
//Faça um sistema que receba um numero do usuario e gere a tabuada daquele numero
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, incremento = 0, repeticao;
		
		System.out.println("Manda um numero para calcular: ");
		numero = entrada.nextInt();
		System.out.println("Quer fazer isso quantas vezes?: ");
		repeticao = entrada.nextInt();
		
		while(incremento < repeticao) {
			System.out.println(numero + " * " + incremento + " = " + (numero * incremento));
			incremento++;
		}

	}

}
