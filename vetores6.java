import java.util.Scanner;

public class vetores6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numero = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("digite um numero no qual deseja excluir (1-10): ");
        int num = scanner.nextInt();

        int posicao = -1;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == num) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            System.out.println("nenhum numero com esse valor foi encontrado.");
        } else {
            int[] novoVetor = new int[numero.length - 1];
            int j = 0;

            for (int i = 0; i < numero.length; i++) {
                if (i != posicao) {
                    novoVetor[j] = numero[i];
                    j++;

                }
            }
            System.out.print("Vetor após remoção: ");
            for (int n : novoVetor) {
                System.out.print(n + " ");

            }
        }

        scanner.close();
    }
}
