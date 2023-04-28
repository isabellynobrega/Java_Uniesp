public final class LivroRomance extends Livros{
    public LivroRomance(String nome, Double preco) {
        super(nome, preco);
    }
    @Override
    public double desconto() {
        return this.preco * 0.9;
    }
}

