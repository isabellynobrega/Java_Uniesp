public class Roupas extends Produtos implements PrecoFixo{
    public Roupas(String nome,Double preco){
        super(nome,preco);
    }
    @Override
    public double PrecoFixo(){
        return this.preco;
    }
}
