/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.vehiculos.Automovil;
import udem.edu.co.vehiculos.CamionMasDosEjes;
import udem.edu.co.vehiculos.CamionUnEje;
import udem.edu.co.vehiculos.Moto;
import udem.edu.co.vehiculos.interfaces.Vehiculo;

/**
 *
 * @author s107e11
 */
public class transportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List <Vehiculo> vehiculos = new ArrayList();
        
        vehiculos.add(new Automovil("ppp111","toyota"));
        vehiculos.add(new Moto("ttt334","yamaha"));
        vehiculos.add(new CamionUnEje("ttl455","renault"));
        vehiculos.add(new CamionMasDosEjes("zzz229","renault"));
        
        for(Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo.toString());
            System.out.println("\n");
        }
    }   
}
