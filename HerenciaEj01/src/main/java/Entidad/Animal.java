/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.  
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:  
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;
    
    //Constructores

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    //Metodo para saber de que se alimenta
    public void alimento(){
    }
    
}
