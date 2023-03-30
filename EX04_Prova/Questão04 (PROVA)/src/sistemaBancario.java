import java.util.Scanner;

public class sistemaBancario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cliente c=new Cliente();

        System.out.println("Olá, informe o seu nome:");
        c.setNome(sc.next());
        System.out.println("Olá"+c.getNome()+", você está na aba saques e depositos!\n"+"Para deposito digite 1\n"+"Para saque digite 2");

        int x= sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Olá"+c.getNome()+", você escolheu a opção deposito.");
                System.out.println("Informe o valor desejado para o deposito:");
                c.setDeposito(sc.nextDouble());
                System.out.println("Operação realizada com sucesso!");
                break;

            case 2:
                System.out.println("Olá"+c.getNome()+", você escolheu a opção saque.");
                System.out.println("O valor disponivel é:"+c.getDeposito());
                System.out.println("Informe o valor que deseja realizar o saque:");
                c.setSaque(sc.nextDouble());
                if (c.getSaque()>c.getDeposito()){
                    System.out.println("Saldo insuficiente");
                }else{
                    System.out.println("Operação realizada com sucesso!");
                }
        }
    }
}
