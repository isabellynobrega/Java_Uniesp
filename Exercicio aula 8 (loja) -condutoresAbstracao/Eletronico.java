public class Eletronico extends Produtos{
    public Eletronico(String nome,Double preco){
        super(nome,preco);
    }
    @Override
    public double desconto(){
        return this.preco * 0.95;
    }
}
