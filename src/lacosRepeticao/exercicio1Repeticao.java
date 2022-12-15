package lacosRepeticao;

public class exercicio1Repeticao {
	
	//Informar todos os números de 1000 a 1999 que quando divididos por 11
	//obtemos resto = 5. (FOR)

	public static void main(String[] args) {
		int incremento;
		
		for(incremento = 1000; incremento <= 1999; incremento++) {
			if(incremento % 13 == 5) {
				System.out.println(incremento);	
			}
		}
	}
}
