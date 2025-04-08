/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;
import model.circulo;
/**
 *
 * @author chicl
 */
import javax.swing.JOptionPane;
public class AreaCirculo {

    public static void main(String[] args) {
        circulo cl = new circulo();
        cl.setRaio(Double.parseDouble(JOptionPane.showInputDialog("digite o valor do raio: ")));
        cl.setPi(Double.parseDouble(JOptionPane.showInputDialog("digite o valor de pi: ")));
        JOptionPane.showMessageDialog(null,"A area é: "+cl.area());
    }
}
