public class Vila {
    private String nome; 
    private String pais;
    private String lider;

    public Vila (String nome, String pais, String lider) {
        this.nome = nome; 
        this.pais = pais; 
        this.lider = lider; 
    
    }

    public String getNome(){
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public String getLider() {
        return lider;
    }

    public void apresentar() {
        System.out.println(nome + " fica no " + pais + " e é liderada por " + lider);
    }    
}
