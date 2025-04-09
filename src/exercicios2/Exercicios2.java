
package exercicios2;
import javax.swing.JOptionPane;
import model.relogio;

public class Exercicios2 {


    public static void main(String[] args) {
        relogio clock = new relogio();
        
        clock.setHora(Integer.parseInt(JOptionPane.showInputDialog("digite que horas são: ")));
        clock.setMinuto(Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos: ")));
        clock.setSegundo(Integer.parseInt(JOptionPane.showInputDialog("Digite os segundos: ")));
        
        clock.condicao();
   
        
        JOptionPane.showMessageDialog(null,"As horas são: "+clock.getHora()+"h "+clock.getMinuto()+"m "+clock.getSegundo()+"s ");
        // TODO code application logic here
    }
    
}
