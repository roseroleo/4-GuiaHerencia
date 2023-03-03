/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author roser
 */
public class Caballo extends Animal {
    Caballo c1 = new Caballo();

    public Caballo() {
    }
    
    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String alimento() {
        System.out.println("Soy un Caballo y me alimento de ");
        return super.alimento(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
//    public void Alimento(){
//    }
}
