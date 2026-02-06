public class Aluno {

    //atributo privado
    private String nome;
    private double nota1;
    private double nota2;

    //construtor da classe aluno
    Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        //this = atributo
        // = nome = parametro
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Getter: acesso ao nome de forma controlada
    public String getNome(){
        return nome;
    }

    //Setter: altera o nome com controle
    public void setNome(String nome){
        this.nome = nome;
    }

    //metodo que calcula a media
    double media(){
        return (nota1 + nota2)/2;
    }

    //metodo da decisao
    String situacao(){
        if(media()>=7){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }
}
