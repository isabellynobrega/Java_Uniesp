public class Produto {
    private int codigo, quantidade;
    private String nome;


    public void setNome (String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }


    public void vendaQuant( int quantidadep){
     quantidade=quantidade-quantidadep;

    }
}
