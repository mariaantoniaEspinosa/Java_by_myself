import java.util.Scanner;

public class Exercício06 {
    //ler 3 valores e informar o maior
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);

        int valor1;
        int valor2;
        int valor3;

        System.out.print("Digite o valor 1: ");
        valor1 = sc.nextInt();

        System.out.print("Digite o valor 2: ");
        valor2 = sc.nextInt();

        System.out.print("Digite o valor 3: ");
        valor3 = sc.nextInt();

        if(valor1 >= valor2 && valor1>= valor3){
            System.out.println("O maior valor é " + valor1);
        }
        else if(valor2 >= valor1 && valor2 >= valor3){
            System.out.println("O maior valor é: " + valor2);
        }
        else{
            System.out.println("O maior valor é: " + valor3);
        }

        sc.close();

    }
}
