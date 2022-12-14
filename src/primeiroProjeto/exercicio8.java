package primeiroProjeto;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float soma, custo, porcentagem, impostos;
		
		System.out.println("Entre com o custo de fabrica: ");
		custo = entrada.nextFloat();
		
		porcentagem = ((custo/100)*28);
		impostos = ((custo/100)*45);
		
		soma = ((porcentagem + impostos)+ custo);
		
		System.out.println("O custo do carro novo é: " + soma);
		System.out.println("A porcentagem do distribuidor é: " + porcentagem);
		System.out.println("O total de impostos é de: " + impostos);
	}

}
