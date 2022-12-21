package lacosCondicionais;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		
		while(true) {
			
			System.out.println("Digite um numero de 0 a 3 onde: "
					+ "\n 1 - somar 2 com 5"
					+ "\n 2 - elevar o numero digitado ao cubo"
					+ "\n 3 - Quantas letras tem a palavra paralelepipedo?"
					+ "\n 4 - Qual é a quinta letra da palavra incostitucionalissimamente?"
					+ "\n 5 - Sortear um numero aleatorio entre 0 e 1");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1: 
				System.out.println("O resultado de 2+5 e 7");
				break;
				
			case 2:
				System.out.println("2 elevado ao cubo e" + Math.pow(opcao, 3));
				break;
				
			case 3: 
				System.out.println("a palavra paralelepipedo tem " + "paralelepidedo".length() + " letras nela");
				break;
				
			case 4:
				System.out.println("A quinta letra e: " + "incostitucionalissimamente".charAt(4));
				break;
				
			case 5:
				System.out.println("O numero sorteado foi: " + Math.random());
				break;
				
			case 0:
				System.out.println("Obrigado e ate mais.");
				System.exit(0);
				break;
				
			default:
				System.out.println("Digite um numero entre 1 e 3");
				break;
			}
		}

	}

}
