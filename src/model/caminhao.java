/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;


public class caminhao extends veiculo{
    //fazer os metodos do slide
    private int cargaMax;
    private int AlturaMax;
    private int Compmax;

    public caminhao() {
        this(0,0,0);
    }
    

    public caminhao(int cargaMax, int AlturaMax, int Compmax) {
        this.cargaMax = cargaMax;
        this.AlturaMax = AlturaMax;
        this.Compmax = Compmax;
    }

    public caminhao(int cargaMax, int AlturaMax, int Compmax, int quilos, double velocidadeMaxima, double preço) {
        super(quilos, velocidadeMaxima, preço);
        this.cargaMax = cargaMax;
        this.AlturaMax = AlturaMax;
        this.Compmax = Compmax;
        
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getAlturaMax() {
        return AlturaMax;
    }

    public void setAlturaMax(int AlturaMax) {
        this.AlturaMax = AlturaMax;
    }

    public int getCompmax() {
        return Compmax;
    }

    public void setCompmax(int Compmax) {
        this.Compmax = Compmax;
    }
    public void Leitura(){
        super.leitura();
        setCargaMax(Integer.parseInt(JOptionPane.showInputDialog("Diga a carga MAX: ")));
        setAlturaMax(Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura: ")));
        setCompmax(Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento:")));
            
    }
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, impressao());
    }
    public String impressao(){
        super.impressao();
        return("Carga maxima: "+getCargaMax()+"/KG Altura maxima: "+getAlturaMax()+"m Comprimento maximo: "+getCompmax()+"m");
    }
    
}
