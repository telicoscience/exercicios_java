public class TecnicaEspecial {
    private String nome; 
    private int dano; 

    public TecnicaEspecial(String nome, int dano) {
        this.nome = nome; 
        this.dano = dano;
    }

    public String getNome() {
        return nome; 
    }

    public int getDano() {
        return dano;
    }

    public void apresentar() {
        System.out.println(nome + " causa " + dano +" de dano.");
    }
}
