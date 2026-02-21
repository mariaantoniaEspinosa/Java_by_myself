import java.util.Scanner;
// Faça um programa para leitura de dois números e após faça as quatro operações matemáticas

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1, n2;
        double soma, sub, mul, div;

        System.out.print("Digite o primeiro numero: ");
        n1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        n2 = scanner.nextDouble();

        soma = n1 + n2;
        sub = n1 - n2;
        mul = n1 * n2;
        div = n1 / n2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Divisao: " + div);
        System.out.println("Multiplicação: " + mul);

        scanner.close();
    }
}
