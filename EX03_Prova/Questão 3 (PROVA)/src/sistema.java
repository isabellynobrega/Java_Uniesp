public class sistema {
    public static void main(String[] args) {
        Aluno a=new Aluno();
        Professor p=new Professor();

        System.out.println("Olá usuario, aqui está todas as informações disponiveis no sistema");

        System.out.println("Nome do aluno:"+a.getNomeAluno());
        System.out.println("Senha do aluno:"+a.getSenha());
        System.out.println("-------------------------------------");
        System.out.println("Nome do professo:"+p.getNomeProfessor());
        System.out.println("Especialização do professor:"+p.getEspecializacao());
    }
}
