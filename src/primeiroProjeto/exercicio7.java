package primeiroProjeto;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		float a, b, c, d, e, f, X, Y;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		a = entrada.nextFloat();

		System.out.println("Informe o valor de B: ");
		b = entrada.nextFloat();
		
		System.out.println("Informe o valor de C: ");
		c = entrada.nextFloat();
		
		System.out.println("Informe o valor de D: ");
		d = entrada.nextFloat();
		
		System.out.println("Informe o valor de E: ");
		e = entrada.nextFloat();
		
		System.out.println("Informe o valor de F: ");
		f = entrada.nextFloat();
		
		X = (c*e)-(b*f)/(a*e)-(b*d);
		Y = (a*f)-(c*d)/(a*e)-(b*d);
		
		System.out.println("O valor de X é: " + X + " e o valor de Y é: " + Y);

	}

}
