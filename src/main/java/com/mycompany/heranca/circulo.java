/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

//HERANÇA


//import javax.swing.*;

import javax.swing.JOptionPane;

public class circulo extends FiguraGeometrica {
    private double raio;
    public circulo() {
        this("",0);
    }   
    public circulo(String cor, double raio) {
        super(cor);
        setRaio(raio);
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public void leitura() {
        super.leitura();
        setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio")));
    }
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null,"O raio é " + getRaio());
    }
    public String paraString() {
        return (super.paraString() + "/ Raio : " + getRaio());
    }
    public double getArea() {
        return (Math.PI * getRaio() * getRaio());
    }
}
