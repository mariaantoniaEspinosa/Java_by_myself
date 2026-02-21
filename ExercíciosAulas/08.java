import java.util.Scanner;

public class Questão08 {
    //numeros se sao multiplos ou não
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite o numero 1: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o numero 2: ");
        numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
