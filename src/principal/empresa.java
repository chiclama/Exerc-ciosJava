/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import javax.swing.JOptionPane;

public class empresa {
    private String nome;
    private String enedereco;
    private String cidade;
    private String estado;
    private int cep;
    private int fone;

    public empresa() {
        this("0","0","0","0",0,0);
    }

    public empresa(String nome, String enedereco, String cidade, String estado, int cep, int fone) {
        this.nome = nome;
        this.enedereco = enedereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnedereco() {
        return enedereco;
    }

    public void setEnedereco(String enedereco) {
        this.enedereco = enedereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }
    public void Leitura(){
        setNome(JOptionPane.showInputDialog("Diga o nome da empresa; "));
        setEnedereco(JOptionPane.showInputDialog("Diga o edereco: "));
        setCidade(JOptionPane.showInputDialog("diga a cidade:  "));
        setEstado( JOptionPane.showInputDialog("Diga seu estado: "));
        setCep(Integer.parseInt(JOptionPane.showInputDialog("Diga o cep: ")));
        setFone(Integer.parseInt(JOptionPane.showInputDialog("Diga o telefone: ")));
        
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,impressao());
    }
    public String impressao(){
        return ("Nome = " +getNome()+"endereco = " +getEnedereco()+"cidade: " +getCidade()+"Estado: "+getEstado()
                +"Cep: "+getCep()+ "fone: "+getFone());
    }
}
