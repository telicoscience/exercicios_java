public class ArmaNinja {
    private String nome; 
    private String tipo; 
    private int dano; 

    // Construtor do Armaninja
    public ArmaNinja(String nome, String tipo, int dano) {
        this.nome = nome; 
        this.tipo = tipo; 
        this.dano = dano; 
    }

    public String getNome() {
        return nome; 
    }

    public String getTipo() {
        return tipo;
    }

    public int getDano() {
        return dano;
    }
    
    public void apresentar() {
        System.out.println(nome + " é uma arma do tipo " + tipo + " e causa " + dano + " de dano");
    }
}
