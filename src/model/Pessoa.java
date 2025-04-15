/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;
/**
 *
 * @author chicl
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void leitura(){
        setNome(JOptionPane.showInputDialog("diga seu nome: "));
        setEndereco(JOptionPane.showInputDialog("digite seu endereço: "));
        setTelefone(JOptionPane.showInputDialog("Digite seu telefone: "));
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,impressao());
    }
    public String impressao(){
        return ("Nome: "+getNome()+"Endereco: "+getEndereco()+"telefone: "+getTelefone());
        
    }
    
}
