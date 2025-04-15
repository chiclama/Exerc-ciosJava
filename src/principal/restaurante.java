/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author chicl
 */
public class restaurante extends empresa {
    private int valor;
    private String cardapio;

    public restaurante() {
        
        
    }

    public restaurante(int valor, String cardapio, String nome, String enedereco, String cidade, String estado, int cep, int fone) {
        super(nome, enedereco, cidade, estado, cep, fone);
        this.valor = valor;
        this.cardapio = cardapio;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }
    
    
    
    
}
