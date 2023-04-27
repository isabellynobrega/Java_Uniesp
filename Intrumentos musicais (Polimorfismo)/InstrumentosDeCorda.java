public class InstrumentosDeCorda extends Instrumentos{


    public InstrumentosDeCorda(String nome, String material, int quantidade) {
        super(nome,material,quantidade );

    }

    public void trocarCorda(){
        System.out.println("Este intrumento troca corda!");
    }

    public void afinar(){
        System.out.println("Este intrumento precisa ser afinado!");
    }
}
