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

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    //Metodo alimentarse
    @Override
    public void alimento(){
        System.out.println("Animal Perro1 : alimento = "+this.alimento);
        System.out.println("Animal Perro2 : alimento = "+this.alimento);

    }
}
