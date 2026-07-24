public class Armadura {
    private String material;
    private int defesa; 
    private double peso;

    // Construtor

    public Armadura(String material, int defesa, double peso)
    {
        this.material = material;
        this.defesa = defesa;
        this.peso = peso;
    }

    // Métodos da classe armadura 
    public String getMaterial() 
    {
        return material;
    }

    public int getDefesa() {
        return defesa;
    }

    public double getPeso() {
        return peso;
    }

}
