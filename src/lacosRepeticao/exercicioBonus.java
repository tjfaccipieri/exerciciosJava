package lacosRepeticao;

import java.util.Scanner;

public class exercicioBonus {

	//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
	//coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
//	a) m�dia do sal�rio da popula��o; 
//	b) m�dia do n�mero de filhos; 
//	c) maior sal�rio; 
//	d) percentual de pessoas com sal�rio at� R$100,00.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qntFilhos, incremento, salarioAbaixo = 0;
		double salario, mediaSalario = 0.0, maiorSalario = 0.0, percentualSalario = 0.0, mediaFilhos = 0.0;
		
		for(incremento = 0; incremento < 20; incremento++) {
			System.out.println("Qual o seu salario? ");
			salario = entrada.nextFloat();
			
			System.out.println("Quantos filhos voce tem? ");
			qntFilhos = entrada.nextInt();
			
			mediaSalario += salario;
			mediaFilhos += qntFilhos;
			
			if(maiorSalario < salario) {
				maiorSalario = salario;
			}
			
			if(salario <= 100) {
				salarioAbaixo++;
			}
			
			
		}
		System.out.println("A media dos salarios e igual a: " + (mediaSalario / incremento));
		System.out.println("A media de filhos e igual a: " + (mediaFilhos / incremento));
		System.out.println("O maior salario e de: " + maiorSalario);
		
		percentualSalario = (salarioAbaixo * 100)/incremento;
		System.out.println("O percentual de pessoas abaixo de 100 reais de salario e: " + percentualSalario);

	}

}
