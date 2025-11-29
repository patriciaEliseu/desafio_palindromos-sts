package processar_palindromo.apresentacao;

import java.util.Scanner;
import processar_palindromo.processar.Palindromo;

public class PalindromoApp {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Palindromo palindromo = new Palindromo();

        System.out.println("Digite uma palavra: ");
        String palavra = leia.nextLine();

        String mensagem = palindromo.verificar(palavra) 
            ? "Sim, eu sou um palindromo!" 
            : "Infelizmente, eu não sou um palindromo";

        System.out.println(mensagem);
        leia.close();
    }
}
