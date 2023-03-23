import java.util.Scanner;

public class Deposito_bancario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cliente c = new Cliente();

        System.out.println("Informe seu nome:");
        c.setNome(sc.next());

        System.out.println("Olá,"+c.getNome() +", caso deseje realizar um depósito digite 0\n"+"caso deseje realizar um saque digite 1.");
        int x=sc.nextInt();
        switch (x){
            case 0:
                System.out.println("Olá"+c.getNome()+"Você escolheu a opção depósito.");
                System.out.println("Informe o valor desejado a ser depósitado:");
                c.setDeposito(sc.nextDouble());
                System.out.println("Valor depósitado foi:"+c.getDeposito());
                System.out.println("Operação realizada com sucesso!");
                break;
            case 1:
                System.out.println("Olá"+c.getNome()+"Você escolheu a opção saque.");
                System.out.println("O seu saldo atual é de:"+c.getDeposito());
                System.out.println("Informe qual valor deseja realizar o saque:");
                c.setSaque(sc.nextDouble());
                System.out.println("Operação realizada com sucesso!");
                break;


        }
    }
}
