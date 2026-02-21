import java.util.Scanner;

public class Questão07 {
    //mostrar tres numeros em ordem crscente
    public static void main (String[]agrs){
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int auxiliar;

        System.out.println("Digite o primeiro número: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        numero3 = sc.nextInt();

        if (numero1 > numero2) {
            auxiliar = numero1;
            numero1 = numero2;
            numero2 = auxiliar;
        }

        if (numero1 > numero3) {
            auxiliar = numero1;
            numero1 = numero3;
            numero3 = auxiliar;
        }

        if (numero2 > numero3) {
            auxiliar = numero2;
            numero2 = numero3;
            numero3 = auxiliar;
        }

        System.out.println("Ordem crescente> " + numero1  + ", " + numero2 + ", " + numero3);

        sc.close();
    }
}
