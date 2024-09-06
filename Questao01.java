public class Questao01 {

    public static void main(String[] args) {
        int Numero1 = 0;
        int Numero2 = 1;

        for (int i = 0; i < 7; i++) {
            System.out.println("Resultado:" + Numero1);
            Numero2 = Numero1+Numero2;
            Numero1= Numero2-Numero1;
        }
    }
}
