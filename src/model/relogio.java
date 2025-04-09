package model;

import javax.swing.JOptionPane;

public class relogio {
    private int hora;
    private int minuto;
    private int segundo;
    

    public relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public relogio(){
        this (0,0,0);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int Tseg() {
        return ((this.getHora() * 60) * 60 + (this.getMinuto() * 60) + this.getSegundo());
    }

    public void condicao() {
        if (this.getHora() >= 24 || this.getHora() < 0) {
            JOptionPane.showMessageDialog(null, "A hora deve estar entre 0 e 23.");
            this.setHora(0);
            
        }

        if (this.getMinuto() >= 60 || this.getMinuto() < 0) {
            JOptionPane.showMessageDialog(null, "O minuto deve estar entre 0 e 59.");
            this.setMinuto(0);
            
        }

        if (this.getSegundo() >= 60 || this.getSegundo() < 0) {
            JOptionPane.showMessageDialog(null, "O segundo deve estar entre 0 e 59.");
            this.setSegundo(0);
        
        }
    }
}
