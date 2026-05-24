public class Transformacao {
    private String nome;
    private int multiplicador;

    public Transformacao(String nome, int multiplicador) {
        this.nome = nome;
        this.multiplicador = multiplicador;
    }

    public String getNome() {
        return nome;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void apresentar() {
        System.out.println(nome + " multiplica o poder em " + multiplicador + "x.");
    }
}