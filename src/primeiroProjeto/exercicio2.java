package primeiroProjeto;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		int diasVida, dias, mes, ano;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Coloque a quantidade de dias de vida: \n");
		diasVida = entrada.nextInt();
		
		ano = (diasVida/365);
		mes = (diasVida%365/31);
		dias = (diasVida%365%31);
		
		System.out.println("Você tem " + ano + " anos de vida");
		System.out.println("Você tem " + mes + " meses de vida");
		System.out.println("Você tem " + dias + " dias de vida");
	}
}
