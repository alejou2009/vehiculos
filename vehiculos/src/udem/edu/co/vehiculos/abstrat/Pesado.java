/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vehiculos.abstrat;

/**
 *
 * @author Jou Jaramillo Uribe
 * @since 2/09/2021
 * @version 1.0
 */
public abstract class Pesado {
   
    private int valorPeaje;

    public Pesado() {
        this.valorPeaje = 20000;
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }
}
