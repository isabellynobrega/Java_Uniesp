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
                System.out.println("Digite o nome do Prefessor:" );
                pr.setNome(sc.next());
                System.out.println("Digite a idade:" );
                pr.setIdade(sc.nextInt());
                System.out.println("Digite a especialização:" );
                pr.setEspecializacao(sc.next());
                System.out.println("Digite o valor do salário:" );
                pr.setSal(sc.nextDouble());
                System.out.println("Professor cadastrado com sucesso.");
                System.out.println("Deseja visualizar os dados cadastrados? se sim digite 1");
                
                int r = sc.nextInt();
                if (r == 1) {
                   System.out.println(pr.getNome());
                   System.out.println(pr.getIdade());
                   System.out.println(pr.getEspecializacao());
                   System.out.println(pr.getSal());
                } else {
                   System.out.println("Tenha um bom dia!");
                    }

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
                System.out.println("Cadastro realizado com sucesso!");
                System.out.println("Deseja visualizar os dados cadastrados? se sim digite 1");
                int r2 = sc.nextInt();
                if (r2 == 1) {
                   System.out.println(pr.getNome());
                   System.out.println(pr.getIdade());
                   System.out.println(pr.getEspecializacao());
                   System.out.println(pr.getSal());
                } else {
                   System.out.println("Tenha um bom dia!");
        }

    }
}
