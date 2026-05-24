public class Ki {
    // Atributo da classe
    private int nivel;

    // Construtor
    public Ki(int nivel) {
        this.nivel = nivel;
    }

    // Métodos da classe 
    public int getNivel() {
        return nivel;
    }

    public void apresentar() {
        System.out.println("Nível do ki: " + nivel);
    }
}
