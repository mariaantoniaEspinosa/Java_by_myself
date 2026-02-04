import java.util.Scanner;

public class Exercicio03 {
    //LER NUMERO NEGATIVO OU POSITIVO
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //Objeto scanner para ler dados

        System.out.println(("Digite um número:"));

        int num = scanner.nextInt();
        //le o que foi digitado e guarda na variável

        if(num >= 0){
            System.out.println("Positivo");
        } else {
            System.out.println(("Negativo"));
        }
    }
}
