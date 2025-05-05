import java.util.Scanner;

public class vetores1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];
        int soma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("escreva o valor da posição - " + i + ": ");
            num[i] = scanner.nextInt();

            soma = soma + num[i];

        }

        System.out.println("total da soma : " + soma);
        scanner.close();
    }
}
