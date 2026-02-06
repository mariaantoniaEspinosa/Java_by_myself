
public class Carro {

    //atributos
    String nome;
    String marca;
    int ano;
    int velocidade;

    //metodos
    void acelerar(int aceleracao){
        velocidade += aceleracao;
    }
    void freirar(int reduzir){
        velocidade -= reduzir;
    }
    void buzinar(){
        System.out.println("bibibi");
    }
}
