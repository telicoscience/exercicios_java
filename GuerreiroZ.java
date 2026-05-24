public class GuerreiroZ {
    private String nome; 
    private Ki ki;
    private TecnicaEspecial tecnica;
    private Transformacao transformacao;

    public GuerreiroZ(
        String nome, 
        Ki ki, 
        TecnicaEspecial tecnica, 
        Transformacao transformacao
    )
    {
        this.nome = nome; 
        this.ki = ki;
        this.tecnica = tecnica;
        this.transformacao = transformacao;
    }

    public void apresentar() {
        System.out.println("Nome: "+ nome);

        ki.apresentar();
        tecnica.apresentar();
        transformacao.apresentar();
    }

    public static void main(String[] args) {
        Ki kiGoku = new Ki(9000);
        TecnicaEspecial kamehameha = 
        new TecnicaEspecial("kamehameha", 5000);

        Transformacao ssj = new Transformacao("Super Sayajin", 50);
        GuerreiroZ goku = 
            new GuerreiroZ("Goku", kiGoku, kamehameha, ssj);
        goku.apresentar();

        
    }
    
}
