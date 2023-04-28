public final class Gato extends Mamiferos{
    public Gato(String nome, String genero, String especie, String habitat, int idade, String peso) {
        super(nome,genero,especie,habitat,idade,peso);
    }
    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }

    @Override
    public void correr(){
        System.out.println("Eu corro!!");
    }
}
