public class Questao03 {

    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        do {
            K = K + 1;
            SOMA = SOMA + K;
        }
        while (K < INDICE);

        System.out.println(SOMA);
    }
}
