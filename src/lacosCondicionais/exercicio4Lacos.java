package lacosCondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
// n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
// �mpar exiba o n�mero elevado ao quadrado.
public class exercicio4Lacos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("0.00");
		float numero;
		
		System.out.println("Entre com um numero: ");
		numero = entrada.nextFloat();
		
		if(numero % 2 == 0) {
			System.out.println("Voce digitou um numero par, e a raiz quadrada dele eh: " + Math.sqrt(numero));
		} else {
			System.out.println("Voce digitou um numero impar, e ele elevado ao quadrado vai dar: "
					+ decimal.format(Math.pow(numero, 2)));			
		}
		
	}
}
