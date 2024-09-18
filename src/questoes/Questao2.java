package questoes;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe uma palavra ou frase: ");
		String texto = entrada.nextLine();	

		int cont = 0;
		boolean existeLetraA = texto.contains("a");
		
		for(int i = 0; i < texto.length();i ++) {
			if(texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
				cont ++;
			}
		}
		System.out.println(existeLetraA == true? "Lentra 'A' existente": "Letra 'A' não existente");
		System.out.print("Quantidade de letras 'A': " + cont );
	}

}
