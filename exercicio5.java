import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        int soma = 0;
        double media;
        int acimaDaMedia = 0;

        // Entrada dos 12 números e cálculo da soma
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        media = (double) soma / numeros.length;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Média valores: " + media);
        System.out.println("números acima da média: " + acimaDaMedia);

        scanner.close();

    }
}
