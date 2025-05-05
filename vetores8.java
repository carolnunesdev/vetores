import java.util.Scanner;

public class vetores8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 6, 7, 8, 9, 10 };

        int[] C = new int[10];

        // copia os valores de a para c
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }

        // copia os valores de b para c
        for (int i = 0; i < B.length; i++) {
            C[i + A.length] = B[i];
        }

        // imprimir o vetor c, ja com os valores atribuidos em si.
        System.out.println("A junção do elementos A e B resultam em -  ");
        for (int i = 0; i < C.length; i++) {
            System.out.println("valores de C : " + C[i]);
        }

        scanner.close();
    }
}
