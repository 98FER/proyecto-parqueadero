/**
 * clase moto que hereda de la clas padre vahiculos 
 * esta calse tiene su propio metodo de pago 
 */
package proyectoparqueadero;

/**
 *
 * @author mario castañeda
 */
public class Motos extends vehiculos {

    private double PagoMotos;
    private int mEntrada;


    public Motos(String Placa) {
        super(Placa);
        
    }

    public Motos(int PagoMotos, String Placa) {
        super(Placa);
        this.PagoMotos = PagoMotos;
    }

    public int getmEntrada() {
        return mEntrada;
    }

    public void setmEntrada(int mEntrada) {
        this.mEntrada = mEntrada;
    }

 
    public double getPagoMotos() {
        return  PagoMotos;
    }
    //aplicamos descuento de 10%
    public void setPagoMotos(double PagoMotos) {
        this.PagoMotos = PagoMotos-PagoMotos*0.10;
    }

    @Override
    public String toString() {
        return super.toString()+" Motos{" + " minuto de entrada: " + mEntrada + '}';
    }

   

    

}
