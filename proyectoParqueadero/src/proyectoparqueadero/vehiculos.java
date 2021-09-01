/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;

import java.util.ArrayList;

/**
 *
 * @author mario castañeda
 */
public class vehiculos {
    private String Placa;
   

 

    public vehiculos(String Placa) {
        this.Placa = Placa;
    }



    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    @Override
    public String toString() {
        return "vehiculos{" + "Placa: " + Placa + '}';
    }
}
