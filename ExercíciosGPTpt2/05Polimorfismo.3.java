class AlunoPos extends Aluno{
        AlunoPos(String nome, double nota1, double nota2){
            super(nome, nota1, nota2);
        }
        @Override
        double media(){
            return getNota1() * 0.4 + getNota2() * 0.6;
        }
    }
