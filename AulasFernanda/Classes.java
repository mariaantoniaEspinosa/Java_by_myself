public class Main {

    public static void teste(){
        System.out.println("Teste");
    }

    public static void main(String[]args){
        System.out.println("Heloo Word");
        //declaração de uma novaa variavel tipo carro:
        Carro meucarro = new Carro("fusca");
        Carro meucarro2 = new Carro("bmw");
        Carro meucarro3 = new Carro("ferrari");

        String result = meucarro.acelerar();
        meucarro2.acelerar();
        meucarro3.acelerar();

        System.out.println(result);

    }
}
//classes definem os atributos do objeto, as variaveis; além das funções, seu comportamento
//construtores é o metodo especial de uma classe

//NOVA CLASSE:

class Carro {
    //atributos
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }

    //metodos
    public String acelerar(){
        System.out.println("Acelerando o carro " + this.modelo);
        return "oi";
    }

    public String teste(){
        System.out.println("oiii" + this.modelo);
        return "oi";
    }

}
