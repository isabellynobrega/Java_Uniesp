import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.GeraConexao();

        PessoaDAO passoaDAO = new PessoaDAO();
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite o  nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);

        PessoaDAO.adiciona(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }
}
