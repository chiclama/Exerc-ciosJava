/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author chicl
 */
import javax.swing.JOptionPane;

public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
        this(0,0);
        
    }
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
          
    }
    public double getBase(){
        return base;
        
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getaltura(){
        return altura;
    }    
    public void setaltura(double altura){
        this.altura = altura;
        
    }
    public double area(){
        return ((getBase()*getaltura())/2.0);
    }
}
