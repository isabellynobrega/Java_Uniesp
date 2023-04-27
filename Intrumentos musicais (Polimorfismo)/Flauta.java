public final class Flauta extends InstrumentosDeSopro{
    public Flauta(String nome,String material, int quantidade) {
        super(nome, material, quantidade);
    }

    @Override
    public void afinar(){
        System.out.println("Para um bom desempenho afine o seu intrumento");
    }
}
