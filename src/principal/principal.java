/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import model.CarroDePasseio;
import model.caminhao;
public class principal {

  
    public static void main(String[] args) {
        CarroDePasseio CP = new CarroDePasseio();
        caminhao CM = new caminhao();
        
        CP.leitura();
        CP.imprimir();
        
        CM.Leitura();
        CM.imprimir();
        // TODO code application logic here
    }
    
}
