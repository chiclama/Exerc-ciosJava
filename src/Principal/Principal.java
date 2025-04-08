
package Principal;

import javax.swing.JOptionPane;
import model.produto;

public class Principal {
    

    public static void main(String[] args) {
        produto objetoproduto = new produto(1,"produto",20.0);
        objetoproduto.setNome("produto plus");
        JOptionPane.showMessageDialog(null,objetoproduto.getNome());
                
        
    }
    
}
