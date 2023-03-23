import java.util.Scanner;

public class Calculo_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Nome do aluno:");
        a.setNome(sc.next());
        System.out.println("Informe a primeira nota do anulo:");
        a.setNota1(sc.nextDouble());
        System.out.println("Informe a segunda nota do aluno:");
        a.setNota2(sc.nextDouble());
        System.out.println("A media do aluno foi:");
        a.calcular_media();
        System.out.println(a.getMedia());

        if (a.getMedia() >=7){
            System.out.println("Aluno está APROVADO");

        }else if(a.getMedia()<4){
            System.out.println("Aluno está REPROVADO");
        }else{
            System.out.println("Aluno está na FINAL");

        }
    }
}
