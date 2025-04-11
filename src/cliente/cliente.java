
package cliente;


public class cliente {
    private String nome;
    private int idade;
    private String email;
    private  int cpf;

    public cliente() {
        this("00",0,"00",0);
    }

    public cliente(String nome, int idade, String email, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
}
