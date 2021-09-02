/**
 * clase camion que hereda de la clas padre vahiculos 
 * esta calse tiene su propio metodo de pago 
 */
package proyectoparqueadero;

/**
 *
 * @author mario castañeda
 */
public class Camion extends vehiculos {
     private double PagoCamion;
     private int mEntrada;
 


    public Camion( String Placa) {
        super(Placa);
       
    }

    public double getPagoCamion() {
        return PagoCamion;
    }

    public void setPagoCamion(double PagoCamion) {
        this.PagoCamion = PagoCamion+PagoCamion*0.10;
    }

    public int getmEntrada() {
        return mEntrada;
    }

    public void setmEntrada(int mEntrada) {
        this.mEntrada = mEntrada;
    }

  

    @Override
    public String toString() {
        return super.toString()+ " Camion{" + " minuto de entrada: " + mEntrada + '}';
    }

   
  
}
