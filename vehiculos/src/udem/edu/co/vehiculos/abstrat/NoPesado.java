/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vehiculos.abstrat;

/**
 *
 * @author s107e11
 */
public abstract class NoPesado {
    
    private int valorPeaje;

    public NoPesado() {
        this.valorPeaje = 12500;
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }
}
