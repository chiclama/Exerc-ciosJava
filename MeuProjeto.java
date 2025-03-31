/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meuprojeto;

/**
 *
 * @author chicl
 */

import javax.swing.JOptionPane;

public class MeuProjeto {

    public static void main(String[] args) {
        String usuario = JOptionPane.showInputDialog("digite seu usuário: ");
        String real = "chiclama";
        String senha = JOptionPane.showInputDialog("digite sua senha: ");
        String reals = "cadulindo13";
        if(usuario.equals(real) && senha.equals(reals)){
            JOptionPane.showMessageDialog(null,"bem vindo "+usuario);
        }else{
            JOptionPane.showMessageDialog(null,"usuario ou senha incorretos");
        }
        
    }
}
