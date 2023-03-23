import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Informe seu nome:");
        p.setNome(sc.next());
        System.out.println("Informe sua idade:");
        p.setIdade(sc.nextInt());

        System.out.println("Informe seu endereço:");
        p.setEndereço(sc.next());
        System.out.println("Cadastro finalizado com sucesso!");

        System.out.println("Feliz aniversário," +p.getNome());
        p.aniversario();
        System.out.println(p.getIdade());

    }
}
