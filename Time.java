public class Time {
    private String nome;
    private String sensei;
    private int quantidadeMembros;

    public Time(String nome, String sensei, int quantidadeMembros) {
        this.nome = nome;
        this.sensei = sensei;
        this.quantidadeMembros = quantidadeMembros;
    }

    public String getNome() {
        return nome;
    }

    public String getSensei() {
        return sensei;
    }

    public int getQuantidadeMembros() {
        return quantidadeMembros;
    }

    public void apresentar() {
        System.out.println(nome + " é liderado por " + sensei + " e possui " + quantidadeMembros + " membros.");
    }
}