public class Ninja {
    String nome; 
    Vila vila;
    Time time;
    ArmaNinja arma;
    Jutsu jutsu;
    
    // Construtor Ninja
    public Ninja(String nome, Vila vila, Time time, ArmaNinja arma, Jutsu jutsu) {
        this.nome = nome;
        this.vila = vila;
        this.time = time;
        this.arma = arma;
        this.jutsu = jutsu;

    }

    // Novo método: usar jutsu
    public void usarJutsu() {
        System.out.println(nome + " usou " +jutsu.getNome() + "!");
    }
    // Método apresentar da classe Ninja
    public void apresentar() {
    System.out.println("Nome: " + nome);
    System.out.println("Vila: " + vila.getNome());
    System.out.println("Time: " + time.getNome());
    System.out.println("Arma: " + arma.getNome());
}
    public static void main(String[] args) {
        Vila folha = new Vila("Vila da Folha", "País do fogo", "Hokage");
        Time time7 = new Time("Time 7", "Kakashi", 3);
        ArmaNinja arma = new ArmaNinja("Kunai", "Arremesso", 10);
        Jutsu jutsu = new Jutsu("Jutsu Clone das sombras", " ", 50);
        // Já usamos o construtor, agora podemos criar o objeto Naruto, que é da classe ninja.
        Ninja naruto = new Ninja("Naruto", folha, time7, arma, jutsu);
        naruto.apresentar();
        naruto.usarJutsu();
        jutsu.apresentar();
        
    }
}
