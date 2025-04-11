
package projetobanco;
import cliente.cliente;
import empregado.empregado;
import socios.socios;
import javax.swing.JOptionPane;

public class ProjetoBanco {

   
    public static void main(String[] args) {
        cliente cl = new cliente();
        empregado emp = new empregado();
        socios socio = new socios();
        
        String resposta = JOptionPane.showInputDialog("ola, se voce for sócio digite (SC)/Empregado (EP)/Cliente CL: " );
        if(resposta.equalsIgnoreCase("SC")){
            socio.setNome(JOptionPane.showInputDialog("digite seu nome: "));
            socio.setIdade(Integer.parseInt(JOptionPane.showInputDialog("digite sua idade sócio: ")));
            socio.setEmail("Digite seu email: ");
            socio.setCpf(Integer.parseInt(JOptionPane.showInputDialog("digite seu cpf: ")));
            
            JOptionPane.showMessageDialog(null, "Seja bem vindo Sócio "+socio.getNome()+" !.");
        
    }else if(resposta.equalsIgnoreCase("EP")){
        emp.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        emp.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        emp.setEmail(JOptionPane.showInputDialog("Digite seu email funcionário: "));
        emp.setCpf(Integer.parseInt(JOptionPane.showInputDialog("digite seu cpf: ")));
        
        JOptionPane.showMessageDialog(null, "Seja bem vindo funcionario "+emp.getNome()+" !.");
    }else if(resposta.equalsIgnoreCase("CL")){
        cl.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        cl.setIdade(Integer.parseInt(JOptionPane.showInputDialog("digite sua idade: ")));
        cl.setEmail(JOptionPane.showInputDialog("digite seu email cliente: "));
        cl.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite seu cpf: ")));
        
        JOptionPane.showMessageDialog(null, "Seja bem vindo amigo "+cl.getNome()+" !.");
    }else{
        JOptionPane.showMessageDialog(null, "De uma resposta correta");
       
    }
        
           

    }
    
}
