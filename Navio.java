public class Navio {
    private String nome; 
    private int canhoes;
    private double velocidade;

    // Construtor
    public Navio(String nome, int canhoes, double velocidade) {
        this.nome = nome;
        this.canhoes = canhoes;
        this.velocidade = velocidade;
    }
    
    public String getNome() {
        return nome;
    }

    public int getCanhoes() {
        return canhoes;
    }

    public double getVelocidade() {
        return velocidade;
    }
}
