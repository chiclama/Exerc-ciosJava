
package model;

public class aluno {
    private String nome;
    private int idade;
    private int ano;

    public aluno(String nome, int idade, int ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }
    public aluno(){
        this("default",0,0);
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
           
}

