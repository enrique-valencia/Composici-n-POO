/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composición;

import ico.fes.componentes.Computadora;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author 52553
 */
public class Composición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora Computadora1=new Computadora();
        Computadora1.setMarca("Asus");
        Computadora1.setModelo("Rog");
        
        Monitor Monitor1=new Monitor();
        Monitor1.setMarca("Asus");
        Monitor1.setModelo("ROG");
        Monitor1.setPulgadas(35.0);
        
        Cpu Cpu1=new Cpu();
        Cpu1.setMarca("ryzen");
        Cpu1.setModelo("5");
        Cpu1.setVelocidad(3.6);
        
        Mouse Mouse1=new Mouse();
        Mouse1.setMarca("Logitech");
        Mouse1.setModelo("G300s");
        Mouse1.setTipo("Laser");
        
        Teclado Teclado1=new Teclado();
        Teclado1.setMarca("Corsair");
        Teclado1.setModelo("K95 RGB Platinum");
        Teclado1.setNumeroDeTeclas(90);
        
        System.out.println(Computadora1);
        System.out.println(Monitor1);
        System.out.println(Cpu1);
        System.out.println(Mouse1);
        System.out.println(Teclado1);
    }
    
}
