package lacosCondicionais;

import java.util.Scanner;

// Faça um programa que receba três inteiros 
// e diga qual deles é o maior.
public class exercicio1Lacos {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		num1 = entrada.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		num2 = entrada.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		num3 = entrada.nextInt();
		
//		System.out.println((num1 > num2 && num1 > num3) 
//				? "Numero 1 maior" 
//						: (num2 > num3) 
//						? "Numero 2 maior" 
//								: "Numero 3 maior");
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O maior número da lista foi o primeiro digitado, que é: " + num1);
		} else if(num2 > num3)  {
			System.out.println("O maior número da lista foi o segundo digitado, que é: " + num2);
		} else {
			System.out.println("O maior número da lista foi o terceiro5 digitado, que é: " + num3);
		}	
	}
}
