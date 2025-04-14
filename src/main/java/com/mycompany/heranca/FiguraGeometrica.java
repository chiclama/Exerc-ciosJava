
package com.mycompany.heranca;
        
import javax.swing.JOptionPane;
public class FiguraGeometrica {
    private String cor;

    public FiguraGeometrica() {
        this("");
    }

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void leitura(){
        setCor(JOptionPane.showInputDialog("digite a cor: "));
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"A COR É: "+getCor());
           
    }
    public String paraString(){
        return ("Cor:  "+getCor());
    }
    
    
}
