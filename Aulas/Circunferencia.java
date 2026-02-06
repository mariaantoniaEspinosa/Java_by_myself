import java.util.Scanner;

public class Painel {
    public static void main(String[] args){

        // circunferencia = 2 * Math.PI * raio;
        // area = Math.PI * Math.pow(raio, 2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3)

        Scanner scanner = new Scanner(System.in);

        double raio;
        double circunferencia;
        double volume;
        double area;

        System.out.print("Digite o raio: ");;
        raio = scanner.nextDouble();

        circunferencia = 2 * Math.PI * raio;
        volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);
        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A circunferencia sera: %.1f\n ", circunferencia);
        System.out.printf("O volume sera: %.1f\n ", volume);
        System.out.printf("A area sera: %.1f", area);

        scanner.close();

    }
}
