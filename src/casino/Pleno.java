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
public class Pleno extends Casillero{
    int numero;
    String color; //rojo, negro, verde

    public Pleno() {
    }

    public Pleno(int numero, String color) {
        this.numero = numero;
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int CalcularGanancia() {
        return getApuesta() * 36; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
