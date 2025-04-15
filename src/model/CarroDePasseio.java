/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;

public class CarroDePasseio extends veiculo {
    private String cor;
    private String modelo;

    public CarroDePasseio() {
        
        this("0","0");
    }

    public CarroDePasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public CarroDePasseio(String cor, String modelo, int quilos, double velocidadeMaxima, double preço) {
        super(quilos, velocidadeMaxima, preço);
        this.cor = cor;
        this.modelo = modelo;
    }

    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void leitura(){
        super.leitura();
        setCor(JOptionPane.showInputDialog("qual a cor: "));
        setModelo(JOptionPane.showInputDialog("qual o modelo:"));
    }
    public void imprmir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null,impressao2());
        
    }
    public String impressao2(){
        super.impressao();
        return ("cor: "+getCor()+" modelo: "+getModelo());
        
                
        
    }
       
      
    
    
    
}
