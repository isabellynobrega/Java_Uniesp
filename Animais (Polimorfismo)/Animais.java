public abstract class Animais {
    protected String nome, genero, especie,habitat;
    protected int idade;
    protected String peso;

    public Animais(String nome, String genero, String especie, String habitat, int idade, String peso) {
        this.nome = nome;
        this.genero = genero;
        this.especie = especie;
        this.habitat = habitat;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void emitirSom(){
        System.out.println("Este animal emite som");
    }

    public void correr(){
        System.out.println("Este animal corre");
    }
    public void Voar() {
        System.out.println("Este animal voa");
    }

}
