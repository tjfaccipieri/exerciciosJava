package lacosCondicionais;

import java.util.Scanner;

// faça um programa que receba 3 numeros, e retorne os mesmos na ordem crescente
public class exercicio2Lacos {

	public static void main(String[] args) {
		int num1, num2, num3, controle;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		num2 = entrada.nextInt();
		System.out.println("Digite o terceiro numero");
		num3 = entrada.nextInt();
		
		
		if(num1 < num2) {
			controle = num2;
			num2 = num1;
			num1 = controle;
		}
		
		if(num1 < num3) {
			controle = num3;
			num3 = num1;
			num1 = controle;
		}
		
		if(num2 < num3) {
			controle = num3;
			num3 = num2;
			num2 = controle;
		}
		
		System.out.println("O primeiro numero eh: " + num3 + ", e o segundo eh: " + num2 + ", e o terceiro eh: " + num3);
		
	}

}
