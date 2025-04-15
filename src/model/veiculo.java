
package model;
import javax.swing.JOptionPane;


public class veiculo {
    private int quilos;
    private double velocidadeMaxima;
    private double preço;

    public veiculo() {
        this(0,0,0);
    }

    public veiculo(int quilos, double velocidadeMaxima, double preço) {
        this.quilos = quilos;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preço = preço;
    }

    public int getQuilos() {
        return quilos;
    }

    public void setQuilos(int quilos) {
        this.quilos = quilos;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    public void leitura(){
        setQuilos(Integer.parseInt(JOptionPane.showInputDialog("Quantos quilos tem o veículo? ")));
        setVelocidadeMaxima(Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade maxima em km/h: ")));
        setPreço(Double.parseDouble(JOptionPane.showInputDialog("qual o preço: ")));
         
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null,impressao());
    }
    
    public String impressao(){
        return ("Quilos: "+getQuilos()+"/KG Velocidade máxima: "+getVelocidadeMaxima()+"KM/H preço:R$:  "+getPreço());
    }
    
    
}
