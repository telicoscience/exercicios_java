public class Cavaleiro {
    // Atributos da classe cavaleiro - O que o cavaleiro `tem`?
    private String nome;
    private int nivel;
    private Armadura armadura;

      public Cavaleiro(String nome, int nivel, Armadura armadura) {
        this.nome = nome;
        this.nivel = nivel;
        this.armadura = armadura;
    }

    
 public static void main(String[] args) {
    Armadura armadura = new Armadura("Bronze", 50, 12.5);
    Cavaleiro seya = new Cavaleiro("Seya", 10, armadura);
    seya.mostrarDados();
 }
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Armadura: " + armadura.getMaterial());

        // Agora, vamos fazer o cavaleiro acessar os dados da armadura: 
        System.out.println("Material da armadura: " + armadura.getMaterial());
        System.out.println("Defesa da armadura: " + armadura.getDefesa());
        System.out.println("Peso da armadura: " + armadura.getPeso());
}

}


