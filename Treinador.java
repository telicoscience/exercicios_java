public class Treinador {
    private String nome; 
    private Pokemon pokemon; 

    public Treinador (String nome, Pokemon pokemon) {
        this.nome = nome; 
        this.pokemon = pokemon;
    }

    public void apresentar() {
        System.out.println(nome + " possui " + pokemon.getNome() + ".");
    }

    public void apresentarPokemon() {
        pokemon.apresentar();
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Elétrico");
        Treinador ash  = new Treinador("Ash", pikachu);

        ash.apresentar();
        ash.apresentarPokemon();
        
    }
     
}
