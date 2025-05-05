import java.util.Scanner;

public class vetores9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[6];
        int[] b = new int[6];
        int[] c = new int[6];
        int contador = 0;

        // recebimento dos valores aos vetores a e b
        System.out.println("Valores de A");
        for (int i = 0; i < a.length; i++) {
            System.out.println("valor " + i + " :");
            a[i] = scanner.nextInt();
        }

        System.out.println("Valores de B");
        for (int i = 0; i < b.length; i++) {
            System.out.println("valor " + i + " :");
            b[i] = scanner.nextInt();
        }

        // comparação dos valores de ambos e atribuição dos valores iguais a variavel c.
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[contador] = a[i];
                    contador++;
                    break;
                }
            }
        }

        // revelação valores iguais
        System.out.print("Valores em comum: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(c[i] + " ");

            scanner.close();
        }
    }
}
