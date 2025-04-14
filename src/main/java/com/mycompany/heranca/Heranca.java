/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

public class Heranca{
    public static void main(String[] args) {
        triangulo triangulo = new triangulo();
        triangulo.leitura();
        System.out.println("area do triângulo:" + triangulo.getArea());
        
        circulo  circulo = new circulo("Branco",3);
        System.out.println(circulo.paraString());
        System.out.println("area do círculo:" + circulo.getArea());
    }
}