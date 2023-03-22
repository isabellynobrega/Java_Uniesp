import java.util.Scanner;

public class Sistema_academico {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Aluno a = new Aluno();
        Professor pr = new Professor();

        System.out.println("Olá, Você entrou no portar do cadastro! para realizar o cadastro do Professor digite 0, caso queira realizar o cadastro do Aluno digite 1.");
        int x = sc.nextInt();
        switch (x) {
            case 0://Professor
                System.out.println("Digite o nome do Prefessor:" + pr.getNome());
                pr.setNome(sc.next());
                System.out.println("Digite a idade:" + pr.getIdade());
                pr.setIdade(sc.nextInt());
                System.out.println("Digite a especialização:" + pr.getEspecializacao());
                pr.setEspecializacao(sc.next());
                System.out.println("Digite o valor do salário:" + pr.getSal());
                pr.setSal(sc.nextDouble());
                break;

            case 1://Aluno

                System.out.println("Digite o nome do Aluno:" );
                a.setNome(sc.next());
                System.out.println("Digite a idade:" );
                a.setIdade(sc.nextInt());
                System.out.println("Digite a primeira Nota:" );
                a.setNota1(sc.nextDouble());
                System.out.println("Digite a segunda Nota:" );
                a.setNota2(sc.nextDouble());
                a.calcular_media();
                System.out.println("A média do aluno(a) é :" + a.getMedia());
        }

    }
}
