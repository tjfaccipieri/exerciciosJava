package lacosRepeticao;

import java.util.Scanner;

public class exercicio4Repeticao {
//	Uma empresa desenvolveu uma pesquisa para saber as características
//	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
//	pessoas, calcule e mostre: (WHILE)
	
//	1 - o número de pessoas calmas;
//	2 - o número de mulheres nervosas;
//	3 - o número de homens agressivos;
//	4 - o número de outros calmos;
//	5 - o número de pessoas nervosas com mais de 40 anos;
//	6 - o número de pessoas calmas com menos de 18 anos.
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade, sexo, opcao, incremento = 0, pessoasCalmas = 0;
		int mulheresNervosas = 0, calmasMenos = 0, homensAgressivos = 0;
		int outrosCalmos = 0, nervosasMais = 0;
		
		while(incremento < 3) {
			System.out.println("Digite a sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("Escolha o seu sexo: \n 1- Masculino \n 2- Feminino \n 3- Outros");
			sexo = entrada.nextInt();

			System.out.println("Escolha uma opcao: \n 1- Calma \n 2- Nervosa \n 3- Agressiva");
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				pessoasCalmas++;
			}
			
			if(sexo == 2 && opcao == 2) {
				mulheresNervosas++;
			}
			
			if(sexo == 1 && opcao == 3) {
				homensAgressivos++;
			}
			
			if(sexo == 3 && opcao == 1) {
				outrosCalmos++;
			}
			
			if(idade > 40 && opcao == 2) {
				nervosasMais++;
			}
			
			if(idade < 18 && opcao == 1) {
				calmasMenos++;
			}
			
			incremento++;
		}
		
		System.out.println("Total de pessoas calmas: " + pessoasCalmas);
		System.out.println("Total de mulheres nervosas: " + mulheresNervosas);
		System.out.println("Total de homens agressivos: " + homensAgressivos);
		System.out.println("Total de outros calmos: " + outrosCalmos);
		System.out.println("Total de pessoas acima de 40 nervosas: " + nervosasMais);
		System.out.println("Total de pessoas abaixo de 18 calmas: " + calmasMenos);

	}

}
