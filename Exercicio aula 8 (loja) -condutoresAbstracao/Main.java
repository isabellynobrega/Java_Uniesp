public class Main {
    public static void main(String[] args) {
        Livros l = new Livros("Jane Austen",50.00);
        Roupas r = new Roupas("Camisas",30.00);
        Eletronico e =new Eletronico("TV",6000.00);

        System.out.println("Informações sobre o Produto (ROUPAS): \n"+
                "Nome:"+r.getNome()+"\n"+
                "Preço:"+r.getPreco());

        System.out.println("---------------------------------------");

        System.out.println("Informações sobre o Produto (LIVROS):\n"+
                "Nome:"+l.getNome()+"\n"+
                "Preço:"+l.getPreco()+"\n"+
                "Preço com desconto:"+l.desconto());

        System.out.println("----------------------------------------");

        System.out.println("Informações sobre o Produto (ELETRONICO):\n"+
                "Nome:"+e.getNome()+"\n"+
                "Preço:"+e.getPreco()+"\n"+
                "Preço com desconto:"+e.desconto());


    }
}
