public class Feitico {
    private String nome; 
    private String elemento; 
    private int custoMana;

     public Feitico(String nome, String elemento, int custoMana) {
        this.nome = nome; 
        this.elemento = elemento; 
        this.custoMana = custoMana;
    }

    // Métodos da classe Feitico
    public String getNome() {
        return nome;
    }
    
    public String getElemento() {
        return elemento;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void apresentar(){
        
    }
}
