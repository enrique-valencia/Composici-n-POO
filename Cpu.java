/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author 52553
 */
public class Cpu {
    private String marca;
    private String modelo;
    private double velocidad;

    public Cpu() {
    }

    public Cpu(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Cpu{" + "marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + '}';
    }
    
    public void leerInstrucciones(){
        System.out.println("Se estan interpretando las instrucciones requeridas");
    }
}
