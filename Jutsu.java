public class Jutsu {
    private String nome; 
    private String tipo;
    private int custoChakra;

    public Jutsu(String nome, String tipo, int custoChakra) {
        this.nome = nome;
        this.tipo = tipo;
        this.custoChakra = custoChakra;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCustoChakra() {
        return custoChakra;
    }

    public void apresentar () {
        System.out.println(nome + " é um jutsu do tipo" + tipo + "e custa " + custoChakra +" de chakra.");
    }
}
