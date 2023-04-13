public class Main {
    public static void main(String[] args) {


        Professor ps=new Professor("João",35,2.000);
        Aluno a =new Aluno("Isabelly",24,123456789);

        System.out.println(ps.getNome());
        System.out.println(ps.getIdade());
        System.out.println(ps.getSalario());

        System.out.println(a.getNome());
        System.out.println(a.getIdade());
        System.out.println(a.getMatricula());
    }
}
