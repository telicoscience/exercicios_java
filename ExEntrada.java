import javax.swing.JOptionPane;
public class ExEntrada {

    public static void main(String[] args) {
        String nome; 
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        JOptionPane.showMessageDialog(null, "O seu nome é " + nome);
    }
    
}
