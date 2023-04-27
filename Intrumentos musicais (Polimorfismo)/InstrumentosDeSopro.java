public class InstrumentosDeSopro extends Instrumentos {

    public InstrumentosDeSopro(String nome, String material, int quantidade) {
        super(nome,material,quantidade);
    }

    public void afinar(){
        System.out.println("Este instrumento precisa ser avinado!");
    }
}
