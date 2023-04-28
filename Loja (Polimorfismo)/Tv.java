public final class Tv extends Eletonicos {

    public Tv(String nome, Double preco) {
        super(nome, preco);
    }
    @Override
    public double desconto() {
        return this.preco * 0.95;
    }
}