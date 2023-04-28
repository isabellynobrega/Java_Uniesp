public final class Cachorro extends Mamiferos{
    public Cachorro(String nome, String genero, String especie, String habitat, int idade, String peso) {
        super(nome,genero,especie,habitat,idade,peso);
    }
    @Override
    public void emitirSom(){
        System.out.println("AU,AU");
    }

    @Override
    public void correr(){
        System.out.println("Eu corro!!");
    }
}
