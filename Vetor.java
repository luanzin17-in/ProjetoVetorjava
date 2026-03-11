import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] dezPosicoes = new int[10];

        for (int i = 0; i < dezPosicoes.length; i++) {

            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            boolean repetido = false;

            for (int v = 0; v < i; v++) {
                if (dezPosicoes[v] == numero) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Número repetido! Digite um diferente do anterior.");
                i--; 
            } else {
                dezPosicoes[i] = numero;
            }
        }

        System.out.print("{ ");
        for (int i = 0; i < dezPosicoes.length; i++) {
            System.out.print(dezPosicoes[i] + " ");
        }
        System.out.print("}");

        sc.close();
    }
}