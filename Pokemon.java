public class Pokemon {
    private String nome;
    private String tipo;

    //construtor pokemon 
    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void apresentar(){
        System.out.println(nome + " é um pokèmon do tipo " + tipo + ".");

    }
    
}
