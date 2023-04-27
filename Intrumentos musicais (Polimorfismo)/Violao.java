public final class Violao extends InstrumentosDeCorda{
    public Violao(String nome,String material, int quantidade) {
        super(nome, material, quantidade);
    }

    @Override
    public void trocarCorda(){
        System.out.println("troque as cordas!");
    }

    @Override
    public void afinar(){
        System.out.println("Para um bom desempenho afine o seu intrumento");
    }
}
