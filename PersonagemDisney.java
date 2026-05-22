public class PersonagemDisney {
    // Atributos da classe
    private String nome; 
    private String filme; 
    private Companheiro companheiro;

    // Construtor - Ele é chamado quando você cria um objeto novo
    public PersonagemDisney(String nome, String filme, Companheiro companheiro) {
        this.nome = nome;
        this.filme = filme; 
        this.companheiro = companheiro;
    }

    public void apresentar () {
        System.out.println(nome + " é personagem do filme "+ filme+ ".");
        System.out.println("Seu companheiro é " + companheiro.getNome()+ ".");
    }

    public void apresentarCompanheiro() {
        companheiro.apresentar();
    }

    public static void main(String[] args){
        // Aqui foi criado um novo objeto Companheiro
        Companheiro abu = new Companheiro("Abu", "macaco");

        // Aqui foi criado um outro objeto da classe PersonagemDisney
        PersonagemDisney aladdin = new PersonagemDisney("Aladdin", "Aladdin", abu);

        aladdin.apresentar();
        aladdin.apresentarCompanheiro();
    }
}

