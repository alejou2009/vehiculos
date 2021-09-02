/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.vehiculos;

import udem.edu.co.vehiculos.abstrat.Pesado;
import udem.edu.co.vehiculos.interfaces.Vehiculo;

/**
 *
 * @author s107e11
 */
public class CamionMasDosEjes extends Pesado implements Vehiculo{
    
    private String placa;
    private String marca;

    public CamionMasDosEjes(String placa, String marca) {
        super();
        this.placa = placa;
        this.marca = marca;
    }

    public CamionMasDosEjes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "{ \"vehiculo\": {\n    \"tipo vehiculo\": \"camion de dos o más ejes\",\n    \"valor peaje\": \""+super.getValorPeaje()+"\",\n    \"placa\": \""+this.getPlaca()+"\",\n    \"marca\": \""+this.getMarca()+"\",\n    \"transito\": \""+transitar()+"\"\n    }\n}";
    }
    
    @Override
    public String transitar() {
        return "baja velocidad";
    }
}
