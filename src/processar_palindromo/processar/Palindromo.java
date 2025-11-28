package processar_palindromo.processar;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String palindromo ="";
		
		System.out.println("Digite uma palavra: ");
		String palavra = leia.nextLine();
		
		
		
		for(int index = palavra.length() -1; index >= 0; index -- ) {
			palindromo += palavra.charAt(index);
		}
		
		if(palavra.equals(palindromo)) {
			System.out.println("Sim, eu sou um palindromo!");
		}else {
			System.out.println("Infelizmente, eu não sou um palindromo");
		}
		
		leia.close();
	}

}