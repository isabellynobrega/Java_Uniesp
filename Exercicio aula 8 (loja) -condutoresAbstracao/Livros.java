public class Livros extends Produtos{
    public Livros(String nome, Double preco){
        super(nome,preco);
    }
    @Override
    public double desconto(){
        return this.preco * 0.9;
    }
}
