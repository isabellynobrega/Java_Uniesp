public final class Camisas extends Roupas implements precoFixo{
    public Camisas(String nome, Double preco) {
        super(nome, preco);
    }
    @Override
    public double precoFixo() {
        return 0;
    }


}
