import java.util.Scanner;

public class Nota_de_Aula {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Produto p= new Produto();

        System.out.println("Digite o nome do produto:");
        p.setNome(sc.next());
        System.out.println("Digite o seu código:");
        p.setCodigo(sc.nextInt());
        System.out.println("Quantidade desejada do produto:");
        p.setQuantidade(sc.nextInt());
        System.out.println("Produto cadastrado com sucesso");

        System.out.println("Deseja realizar uma venda?\n"+"Digite 1 se deseja realizar a operação\n"+"Digite 0 se deseja encerrar operação");
        int sistema=sc.nextInt();
        System.out.println("Você escolheu a operação:"+sistema);

        switch (sistema){

            case 0:
                System.out.println("Encerrando o programa!");
                break;

            case 1:
                System.out.println("Olá vendedor, você está prestes a realizar uma venda!");
                System.out.println("Informe o código do produto:");
                System.out.println("Informe a quantidade desejada de produto");
                int quantidadep=sc.nextInt();
                p.vendaQuant(quantidadep);
                System.out.println(p.getQuantidade());
                break;
        }

    }
}
