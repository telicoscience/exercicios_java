public class Pirata {
    private String nome; 
    private int nivel;
    private Navio navio; 

    public Pirata( String nome, int nivel, Navio navio) {
        this.nome = nome; 
        this.nivel = nivel;
        this.navio = navio;

    }
    public static void main(String[] args) {
    Navio navio = new Navio("Pérola Negra", 40, 25.5);
    Pirata jack = new Pirata("Jack", 10, navio);

    
    System.out.println(navio.getNome());
    System.out.println(navio.getCanhoes());
    System.out.println(navio.getVelocidade());
    System.out.println(jack);
}

@Override
public String toString() {
    return "Pirata: " + nome 
        + ", nível: " + nivel
        + ", navio: " + navio.getNome();
}
    
    
}
