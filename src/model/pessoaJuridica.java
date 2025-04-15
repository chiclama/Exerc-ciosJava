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
public class pessoaJuridica extends Pessoa{
    private String cnpj;
    private String id;
    private double faturamento;

    public pessoaJuridica() {
        this("0","0",0);
    }
    

    public pessoaJuridica(String cnpj, String id, double faturamento) {
        this.cnpj = cnpj;
        this.id = id;
        this.faturamento = faturamento;
    }

    public pessoaJuridica(String cnpj, String id, double faturamento, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.id = id;
        this.faturamento = faturamento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
    public void Leitura(){
        super.leitura();
        setCnpj(JOptionPane.showInputDialog("Digite seu cnpj: "));
        setId(JOptionPane.showInputDialog("digite seu id: "));
        setFaturamento(Double.parseDouble(JOptionPane.showInputDialog("Digite seu faturamento: ")));
                   
    }
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null,impressao());
    }
    
    public String impressao(){
        super.impressao();
        //cnpj,id,faturamento
        return("CNPJ: "+getCnpj()+"ID: "+getId()+"Faturamento"+getFaturamento());
        
    
}
    
        
    

   
    


    
    
    
    

    
}
