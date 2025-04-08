
package gym;
import model.aluno;
import javax.swing.JOptionPane;
public class Gym {

   
    public static void main(String[] args) {
        aluno novo = new aluno();
        
        novo.setNome(JOptionPane.showInputDialog("DIGITE SEU NOME: "));
        novo.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade: ")));
        novo.setAno(Integer.parseInt(JOptionPane.showInputDialog("digite quanto tempo faz academia: ")));
        
        int resultado;
        resultado = 10;
        if(novo.getAno()<resultado){
            JOptionPane.showMessageDialog(null,"aluno FRANGO");
        }else{
            JOptionPane.showMessageDialog(null, "TA NO SHAPE");
        }
        
        JOptionPane.showMessageDialog(null,"o aluno "+novo.getNome()+"foi registrado com sucesso.");
        
                
             
        
        
    }
    
}
