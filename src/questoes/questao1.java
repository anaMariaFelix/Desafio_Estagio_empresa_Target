package questoes;

import java.util.ArrayList;
import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = Integer.parseInt(entrada.nextLine());
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int valor1 = 0;
		int valor2 = 1; 
		
		lista.add(valor1);
		lista.add(valor2);
		int aux;
		for(int i = 0; i < numero; i++) {
			aux = lista.get(i) + lista.get( i +1);
			lista.add(aux);
		}
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i) + ",");
		}
		System.out.println();
		System.out.print(lista.contains(numero)? "o número pertence a sequência.": "o numero não pertence a sequência.");
	}
}
