public class Questao02 {

    public static void main(String[] args) {
        String texto = "Abacaxi";

        verificarLetraA(texto);
    }

    public static void verificarLetraA(String texto) {

        String textoLower = texto.toLowerCase();


        boolean existeA = textoLower.contains("a");


        int contagemA = 0;
        for (int i = 0; i < textoLower.length(); i++) {
            if (textoLower.charAt(i) == 'a') {
                contagemA++;
            }
        }

        if (existeA) {
            System.out.println("A letra 'a' apareceu " + contagemA + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não existe na string...");
        }
    }
}
