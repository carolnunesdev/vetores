import java.util.Scanner;

public class vetores3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[20];
        int pares = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("escreva numero da posição - " + i + ":");
            num[i] = scanner.nextInt();

        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares++;
            }

        }
        System.out.println("total de numeros pares : " + pares);

        scanner.close();

    }

}
