public class Main {
    public static void main(String[] args) {

        Animais a1=new Passarinho("Jorjão","M","Arara","Floresta",1,"2kg");
        Animais a2=new Gato("Dracaris","M","srd","Domestico",2,"5kg");
        Animais a3=new Cachorro("Ana Catarina","F","srd","Domestico",3,"2kg");

        System.out.println("Inforações gerais dos animais!");
        System.out.println("Mamiferos:\n"+
                "Gato: \n"
                +"Nome: "+a2.getNome()+"\n"+
                "Genero: "+a2.getGenero()+"\n"+
                "Especie: "+a2.getEspecie()+"\n"+
                "Habitat: "+a2.getHabitat()+"\n"+
                "Idade: "+a2.getIdade()+"\n"+
                "Peso: "+a2.getPeso());
        a2.correr();
        a2.emitirSom();
        System.out.println("                             ");
        System.out.println(
                "Cachorro: \n"
                +"Nome: "+a3.getNome()+"\n"+
                "Genero: "+a3.getGenero()+"\n"+
                "Especie: "+a3.getEspecie()+"\n"+
                "Habitat: "+a3.getHabitat()+"\n"+
                "Idade: "+a3.getIdade()+"\n"+
                "Peso: "+a3.getPeso());
        a3.correr();
        a3.emitirSom();
        System.out.println("                                ");
        System.out.println("Aves:\n"+
                "Passarinho: \n"
                +"Nome: "+a1.getNome()+"\n"+
                "Genero: "+a1.getGenero()+"\n"+
                "Especie: "+a1.getEspecie()+"\n"+
                "Habitat: "+a1.getHabitat()+"\n"+
                "Idade: "+a1.getIdade()+"\n"+
                "Peso: "+a1.getPeso());
        a1.emitirSom();
        a1.Voar();
    }
}
