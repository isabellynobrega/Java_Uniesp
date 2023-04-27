public class Main {
    public static void main(String[] args) {
        InstrumentosDeCorda i1= new Violao("Violao","Sitka Spruce",15);
        InstrumentosDeCorda i2=new Harpa("Harpa", "Jacaranda e Ouro",3);
        InstrumentosDeSopro i3=new Flauta("Flauta", "Marfim",40);

        System.out.println("informações dos instrumentos");
        System.out.println("Instrumentos de corda:\n"+
                "nome: "+i1.getNome()+"\n"+
                "material: "+i1.getMaterial()+"\n"+
                "quantidade: "+i1.getQuantidade());
        i1.trocarCorda();
        i1.afinar();
        
        System.out.println("------------------------");
        System.out.println("Instrumentos de corda:\n"+
                "nome: "+i2.getNome()+"\n"+
                "material: "+i2.getMaterial()+"\n"+
                "quantidade: "+i2.getQuantidade());
        i2.trocarCorda();
        i2.afinar();
        System.out.println("------------------------------");
        System.out.println("Instrumentos de sopro:\n"+
                "nome: "+i3.getNome()+"\n"+
                "material: "+i3.getMaterial()+"\n"+
                "quantidade: "+i3.getQuantidade());
        i3.afinar();
    }


}
