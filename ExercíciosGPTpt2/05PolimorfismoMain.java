public class Main{
    public static void main(String[] agrs){
        Aluno a1 = new AlunoGraduacao("Maria", 7.0, 8.0);
        Aluno a2 = new AlunoPos("joao", 7.0, 8.0);

        //Polimorfismo:
        System.out.println(a1.getNome() + " media: " + a1.media());
        System.out.println("Situacao: " + a1.situacao());

        System.out.println(a2.getNome() + " media: " + a2.media());
        System.out.println("Situação: " + a2.situacao());

    }
}
