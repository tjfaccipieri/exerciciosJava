package primeiroProjeto;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double A,B,C,R,S,D;
		
		System.out.println("Insira o valor de A, numero positivo, por favor: ");
		A = entrada.nextFloat();
		
		System.out.println("Insira o valor de B, numero positivo, por favor: ");
		B = entrada.nextFloat();
				
		System.out.println("Insira o valor de C, numero positivo, por favor: ");
		C = entrada.nextFloat();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S)/2;
		
		System.out.println("Valor de R é: "+R+"\nValor de S é: "+S+"\nValor de D é: "+D);
			
	}

}
