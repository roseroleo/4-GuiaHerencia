/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author roser
 */
public class Perro extends Animal {
    Perro p = new Perro();
    
    //Constructores
    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    //Metodo alimentarse
    
    @Override
    public String alimento(){
        System.out.println("Soy un Perro y me alimento de "+p.getAlimento());
        return super.alimento(); 
    }
}
