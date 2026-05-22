public class Companheiro {
    private String nome; 
    private String especie;

    // Construtor que constroi Companheiro
    public Companheiro(String nome, String especie) {
        this.nome = nome; 
        this.especie = especie;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void apresentar() {
    System.out.println(nome + " é um " + especie + ".");
    }
}
