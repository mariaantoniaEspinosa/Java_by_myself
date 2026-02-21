import java.util.Scanner;
//ler 4 numeros e fazer a média e mostrar os maiores que a média
public class Questão04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;

        double media;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numero3 = sc.nextInt();

        System.out.println("Digite o qaurto numero: ");
        numero4 = sc.nextInt();

        media = (numero1 + numero2 + numero3 + numero4) / 4.0;

        System.out.println("Média: " + media);

        if(numero1>media){System.out.println(numero1 + " é maior que a média - 1 ");
        }
        if(numero2>media){System.out.println(numero2 + " é maior que a média - 2 ");
        }
        if(numero3>media){System.out.println(numero3 + " é maior que a média - 3");
        }
        if(numero4>media){System.out.println(numero4 + " é maior que a média - 4");
        }

        sc.close();

    }
}
