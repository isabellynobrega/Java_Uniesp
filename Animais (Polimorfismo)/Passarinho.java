public final class Passarinho extends Ave {
    public Passarinho(String nome, String genero, String especie, String habitat, int idade, String peso) {
        super(nome,genero,especie,habitat,idade,peso);
    }
    @Override
    public void emitirSom(){
        System.out.println("AHHHHH,AHHHHHH");
    }

    @Override
    public void Voar(){
        System.out.println("Eu voo");
    }
}
