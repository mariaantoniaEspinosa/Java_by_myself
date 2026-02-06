public class CarroTestar {
    public static void main (String[] args){
        Carro c1 = new Carro();

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 1998;
        c1.velocidade = 60;

        c1.acelerar(10);
        System.out.println("Velocidade: " + c1.velocidade + "km/h");

        c1.freirar(30);
        System.out.println("Velocidade: " + c1.velocidade + "km/h");
    }
}
