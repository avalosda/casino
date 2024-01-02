/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Ruleta {
    
    int fichas =10;

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }
    
    ArrayList<Casillero> casilleros = new ArrayList<>();
    
    Casillero pares = new Pares();
    Casillero impares = new Impares ();
    
    public void lanzar(){
         //num aleatorio 
         int resultado = (int) (Math.random() *37);
        
         JOptionPane.showMessageDialog(null, " Resultado" + resultado);
         boolean par = (resultado % 2==0);
         if (resultado == 0){           
         } else if (par){
             fichas= fichas + pares.CalcularGanancia();
             System.out.println("pago: " + (pares.getApuesta() * 2));
         } else {
             fichas = fichas + impares.CalcularGanancia();
             System.out.println(" Pago: " + (impares.getApuesta() * 2));
         }
        for (Casillero casillero : casilleros) {
            if(casillero instanceof Pleno){
               Pleno pleno = (Pleno) casillero;
               if (pleno.getNumero() == resultado);{
                fichas = fichas + casillero.CalcularGanancia();
            }
            }
            casillero.limpiar();
            
        }
    }
    
    public Ruleta (){
        casilleros.add(pares);
        casilleros.add(impares);
        casilleros.add(new Pleno(1,"Rojo"));
        casilleros.add(new Pleno(2,"Negro"));
        casilleros.add(new Pleno(3,"Rojo"));
        casilleros.add(new Pleno(4,"Negro"));
        casilleros.add(new Pleno(5,"Rojo"));
        casilleros.add(new Pleno(6,"Negro"));
        casilleros.add(new Pleno(7,"Rojo"));
        casilleros.add(new Pleno(8,"Negro"));
        casilleros.add(new Pleno(9,"Rojo"));
        casilleros.add(new Pleno(10,"Negro"));
        casilleros.add(new Pleno(11,"Negro"));
        casilleros.add(new Pleno(12,"Rojo"));
        casilleros.add(new Pleno(13,"Negro"));
        casilleros.add(new Pleno(14,"Rojo"));
        casilleros.add(new Pleno(15,"Negro"));
        casilleros.add(new Pleno(16,"Rojo"));
        casilleros.add(new Pleno(17,"Negro"));
        casilleros.add(new Pleno(18,"Rojo"));
        casilleros.add(new Pleno(19,"Rojo"));
        casilleros.add(new Pleno(20,"Negro"));
        casilleros.add(new Pleno(21,"Rojo"));
        casilleros.add(new Pleno(22,"Negro"));
        casilleros.add(new Pleno(23,"Rojo"));
        casilleros.add(new Pleno(24,"Negro"));
        casilleros.add(new Pleno(25,"Rojo"));
        casilleros.add(new Pleno(26,"Negro"));
        casilleros.add(new Pleno(27,"Rojo"));
        casilleros.add(new Pleno(28,"Negro"));
        casilleros.add(new Pleno(29,"Negro"));
        casilleros.add(new Pleno(30,"Rojo"));
        casilleros.add(new Pleno(31,"Negro"));
        casilleros.add(new Pleno(32,"Rojo"));
        casilleros.add(new Pleno(33,"Negro"));
        casilleros.add(new Pleno(34,"Rojo"));
        casilleros.add(new Pleno(35,"Negro"));
        casilleros.add(new Pleno(36,"Rojo"));
        
    }
    public void mostrar (){
        for (Casillero casillero : casilleros) {
            System.out.println(casillero);
        }
    }
    
    public void click ( int x, int y){
        
        //ultima linea de la mesa
        if (y>=296 && y<=338){
            if (x>=96 && x <=174){  
            System.out.println("apuesta del 1 al 18");
        }
            if (x>= 175 && x <= 259){//sumar ficha
System.out.println("apuesta pares");              
                pares.sumarFicha();
            }
        if (x>= 265 && x <=345){
            System.out.println("apuesta al rojo");
        }
        if (x>=351 && x <=429){
            System.out.println("apuesta al negro");
        }
        if (x>=435 && x<=514){
            System.out.println("apuesta impares");
            impares.sumarFicha();//sumar ficha
        }
        if (x>=529 && x<=599){
            System.out.println("apuesta del 19 al 36 ");
        }
        
    }
        if (y>=244 && y <=287){
            if (x>=96 && x<=259){
                System.out.println("apuesto a la primer docena");
            }
            if (x>=265 && x<=429){
                System.out.println("apueto a la segunda docena");
            }
            if (x>=435 && x<=599){
                System.out.println("apuesto a la tercer docena");
            }
        }
        if (y>=178 && y <=238){
            if (x>=96 && x<= 132){
                casilleros.get(2).sumarFicha();
            }
            if (x>=139 && x<=172){
                casilleros.get(3).sumarFicha();
                System.out.println("apuesto al 4");
            }
            if (x>=183 && x<=216){
                casilleros.get(4).sumarFicha();
                System.out.println("apuesto al 7");
            }
            if (x>=224 && x<=259){
                casilleros.get(5).sumarFicha();
                System.out.println("apuesto al 10");
            }
             if (x>=265 && x<=301){
                 casilleros.get(6).sumarFicha();
                System.out.println("apuesto al 13");
            }
              if (x>=309 && x<=344){
                  casilleros.get(7).sumarFicha();
                System.out.println("apuesto al 16");
            }
               if (x>=352 && x<=385){
                   casilleros.get(8).sumarFicha();
                System.out.println("apuesto al 19");
            }
                if (x>=394 && x<=427){
                    casilleros.get(9).sumarFicha();
                System.out.println("apuesto al 22");
            }
                 if (x>=436 && x<=470){
                     casilleros.get(10).sumarFicha();
                System.out.println("apuesto al 25");
            }
                  if (x>=479 && x<=512){
                      casilleros.get(11).sumarFicha();
                System.out.println("apuesto al 28");
            }
                   if (x>=519 && x<=555){
                       casilleros.get(12).sumarFicha();
                System.out.println("apuesto al 31");
            }
                    if (x>=564 && x<=597){
                        casilleros.get(13).sumarFicha();
                System.out.println("apuesto al 34");
            }
        
}
        if (y>=108 && y<=169){
            if (x>=96 && x<=132){
                casilleros.get(14).sumarFicha();
                System.out.println("apuesto al 2");
            }
              if (x>=139 && x<=172){
                  casilleros.get(15).sumarFicha();
                System.out.println("apuesto al 5");
            }
            if (x>=183 && x<=216){
                casilleros.get(16).sumarFicha();
                System.out.println("apuesto al 8");
            }
            if (x>=224 && x<=259){
                casilleros.get(17).sumarFicha();
                System.out.println("apuesto al 11");
            }
             if (x>=265 && x<=301){
                 casilleros.get(18).sumarFicha();
                System.out.println("apuesto al 14");
            }
              if (x>=309 && x<=344){
                  casilleros.get(19).sumarFicha();
                System.out.println("apuesto al 17");
            }
               if (x>=352 && x<=385){
                   casilleros.get(20).sumarFicha();
                System.out.println("apuesto al 20");
            }
                if (x>=394 && x<=427){
                    casilleros.get(21).sumarFicha();
                System.out.println("apuesto al 23");
            }
                 if (x>=436 && x<=470){
                     casilleros.get(22).sumarFicha();
                System.out.println("apuesto al 26");
            }
                  if (x>=479 && x<=512){
                      casilleros.get(23).sumarFicha();
                System.out.println("apuesto al 29");
            }
                   if (x>=519 && x<=555){
                       casilleros.get(24).sumarFicha();
                System.out.println("apuesto al 32");
            }
                    if (x>=564 && x<=597){
                        casilleros.get(25).sumarFicha();
                System.out.println("apuesto al 35");
            }
        }
        if (y>=42 && y<=100){
              if (x>=96 && x<=132){
                  casilleros.get(26).sumarFicha();
                System.out.println("apuesto al 3");
            }
              if (x>=139 && x<=172){
                  casilleros.get(27).sumarFicha();
                System.out.println("apuesto al 6");
            }
            if (x>=183 && x<=216){
                casilleros.get(28).sumarFicha();
                System.out.println("apuesto al 9");
            }
            if (x>=224 && x<=259){
                casilleros.get(29).sumarFicha();
                System.out.println("apuesto al 12");
            }
             if (x>=265 && x<=301){
                 casilleros.get(30).sumarFicha();
                System.out.println("apuesto al 15");
            }
              if (x>=309 && x<=344){
                  casilleros.get(31).sumarFicha();
                System.out.println("apuesto al 18");
            }
               if (x>=352 && x<=385){
                   casilleros.get(32).sumarFicha();
                System.out.println("apuesto al 21");
            }
                if (x>=394 && x<=427){
                    casilleros.get(33).sumarFicha();
                System.out.println("apuesto al 24");
            }
                 if (x>=436 && x<=470){
                     casilleros.get(34).sumarFicha();
                System.out.println("apuesto al 27");
            }
                  if (x>=479 && x<=512){
                      casilleros.get(35).sumarFicha();
                System.out.println("apuesto al 30");
            }
                   if (x>=519 && x<=555){
                       casilleros.get(36).sumarFicha();
                System.out.println("apuesto al 33");
            }
                    if (x>=564 && x<=597){
                        casilleros.get(37).sumarFicha();
                System.out.println("apuesto al 36");
            }
        }
         if (y>=42 && y <=238){
                  if (x>=34 && x <=90){
                      casilleros.get(1).sumarFicha();
                  System.out.println(" apuesto al 0");
        }
    }
         fichas --;
}
}