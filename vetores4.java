import java.util.Scanner;

public class vetores4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("digite o numero da posição - " + i + ":");
            num[i] = scanner.nextInt();

        }
        System.out.println("ordem inversa: ");

        for (int i = 7; i >= 0; i--) {
            System.out.println(num[i]);
        }

        scanner.close();
    }
}
