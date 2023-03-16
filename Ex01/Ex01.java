import java.util.Scanner;

public class Ex01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite seu nome:");
        p.setNome(sc.next());
        System.out.println("Digite a sua idade:");
        p.setIdade(sc.nextInt());
        System.out.println("Digite seu endereço:");
        p.setEndereco(sc.next());


        System.out.println(p.getIdade());
        p.aniversario();
        System.out.println(p.getIdade());
    }
}
