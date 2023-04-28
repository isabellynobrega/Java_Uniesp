public class Main {
    public static void main(String[] args) {
    Produto p1=new LivroRomance("Razão e sensibilidade",50.00);
    Produto p2=new Camisas("camisa polo",80.00);
    Produto p3=new Tv("Sansung 55'",6000.00);

        System.out.println("Informações dos produtos");
        System.out.println("Sessão Literária");
        System.out.println("                             ");
        System.out.println("Livros de Romance\n"+
                "Nome: "+p1.getNome()+"\n"+
                "Preço: "+p1.getPreco()+"\n"+
                "Desconto: "+p1.desconto());
        System.out.println("                              ");
        System.out.println("Sessão de Roupas");
        System.out.println("Camisas\n"+
                "Nome: "+p2.getNome()+"\n"+
                "Preço: "+p2.getPreco()+"\n"+
                "Desconto: "+p2.precoFixo()+"\n"+
                "Este produto não recebe desconto");


        System.out.println("                               ");
        System.out.println("Sessão de Eletronicos");
        System.out.println("Tv's \n"+
                "Nome: "+p1.getNome()+"\n"+
                "Preço: "+p1.getPreco()+"\n"+
                "Desconto: "+p1.desconto());


    }


}
