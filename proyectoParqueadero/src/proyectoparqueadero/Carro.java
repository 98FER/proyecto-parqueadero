/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;

/**
 *
 * @author mario castañeda
 */
public class Carro extends vehiculos{
     private double PagoCarro;
    private int mEntrada;




    public Carro( String Placa) {
        super(Placa);
        
    }

    public double getPagoCarro() {
        return PagoCarro;
    }

    public void setPagoCarro(double PagoCarro) {
        this.PagoCarro = PagoCarro;
    }

    


    public int getmEntrada() {
        return mEntrada;
    }

    public void setmEntrada(int mEntrada) {
        this.mEntrada = mEntrada;
    }

    @Override
    public String toString() {
        return super.toString()+" Carro{" + " minuto de entrada: " + mEntrada + '}';
    }

 

    

    
    
}
