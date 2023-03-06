
import javax.swing.JOptionPane;

/*
 * @author Guglielmo H T
 */
public class Exemplo1 {// programa para teste em aula

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String nome, cargo;
        
        nome=JOptionPane.showInputDialog(null,"Qual seu nome?");// linha para fazer pergunta pro usuario
        cargo=JOptionPane.showInputDialog("Digite seu cargo.");
                
        JOptionPane.showMessageDialog(null, "Boa noite!"+nome+cargo);// linha para mostrar mensagem (similiar printf)
        
        
    }
    
}
