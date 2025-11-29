package processar_palindromo.processar;


public class Palindromo {

    public boolean verificar(String palavra) {
        if (palavra == null || palavra.isEmpty()) {
            return false;
        }

        String palavraLimpa = palavra.toLowerCase().replaceAll("[^a-záéíóú]", "");
        String invertida = new StringBuilder(palavraLimpa).reverse().toString();

        return palavraLimpa.equals(invertida);
    }
}
