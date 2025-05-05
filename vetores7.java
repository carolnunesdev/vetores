import java.util.Scanner;

public class vetores7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[15];

        System.out.println("escreve 15 valores->");

        // entrada dos valores
        for (int i = 0; i < num.length; i++) {
            System.out.println("escreva o valor da posição -" + (i + 1) + ":");
            num[i] = scanner.nextInt();
        }

        System.out.println("numero a se conferir: ");
        int nc = scanner.nextInt();

        // soma da quantidade de vezes que o valor é repetido
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == nc) {
                contador++;
            }

        }

        System.out.println("o numero: " + nc + " aparece - " + contador + " vezes.");

        scanner.close();
    }
}
