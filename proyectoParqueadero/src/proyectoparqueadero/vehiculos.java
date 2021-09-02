/**
 * clase padre que hereda su metodo placas a las clases hijas
 */
package proyectoparqueadero;

import java.util.ArrayList;

/**
 *
 * @author mario castañeda
 */
public class vehiculos {
    private String Placa;
   

 
    /**
     * 
     * @param Placa. constructor de placa
     */
    public vehiculos(String Placa) {
        this.Placa = Placa;
    }


    /**
     * 
     * @return placa. 
     */
    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    /**
     * 
     * @return tostring. muestra los datos del objeto
     */
    @Override
    public String toString() {
        return "vehiculos{" + "Placa: " + Placa + '}';
    }
}
