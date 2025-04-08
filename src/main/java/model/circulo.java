/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chicl
 */
public class circulo {
    private double pi;
    private double raio;
    public circulo(){
        this (0,0);
        }
    public circulo(double pi, double raio){
        this.pi = pi;
        this.raio = raio;     
    }
    public void setPi(double pi){
        this.pi = pi; 
    }
    public double getPi(){
        return pi;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
   public double getRaio(){
       return raio;
   }
   public double area(){
       return (getPi() * (getRaio()*2));
       
   }
        
    
}
