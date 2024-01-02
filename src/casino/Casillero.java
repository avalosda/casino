/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

/**
 *
 * @author danie
 */
public class Casillero {
    int apuesta;
    public void limpiar (){
        apuesta = 0;
    }
    public void sumarFicha(){
        apuesta++;
    }
    
    public int getApuesta (){
        return apuesta;
    }
    
    public String toString (){
        return "Apuesta: " + apuesta;
    }
    public int CalcularGanancia (){
        return 0;
    }
    
}
