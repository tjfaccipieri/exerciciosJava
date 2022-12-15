package lacosRepeticao;

import java.util.Scanner;

public class lacoDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, incremento = 0;
		
		System.out.println("Manda um numero ai meu bom: ");
		numero = entrada.nextInt();
		
		do {
			System.out.println(numero + " * " + incremento + " = " + (numero * incremento));
			incremento++;
		} while (incremento == 10);

	}

}
