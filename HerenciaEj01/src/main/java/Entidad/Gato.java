/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author roser
 */
public class Gato extends Animal {
    Gato g = new Gato();

    public Gato() {
    }
    
    public void Alimento(){
        System.out.println("Soy un Gato y me alimento de "+g.alimento);
    }
}
