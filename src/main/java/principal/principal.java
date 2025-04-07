/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

/**
 *
 * @author chicl
 */
public class principal {
    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo();
        
        //entrada
        tri1.setBase(Double.parseDouble(JOptionPane.showInputDialog("digite a base do triangulo: ")));
        tri1.setaltura(Double.parseDouble(JOptionPane.showInputDialog("digite a altura: ")));
        
        JOptionPane.showMessageDialog(null,"a área do triangulo é: " + tri1.area());
    }
        
        
}
    
