import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[15];
        int maior = Integer.MIN_VALUE;
        int posicao = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("digite um numero : ");
            num[i] = scanner.nextInt();

            if (num[i] > maior) {
                maior = num[i];
                posicao = i;

            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição (índice): " + posicao);

        scanner.close();
    }
}
