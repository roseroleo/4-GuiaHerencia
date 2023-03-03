/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herenciaej01;

import Entidad.Animal;
import Entidad.Perro;
import java.util.ArrayList;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.  
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:  
 */
public class HerenciaEj01 {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList();
        //Declaracion del objeto Perro
        Animal perro1 = new Animal("Stich","Carnivoro",15,"Doberman");
        animal.add(perro1);
        perro1.alimento();
        
        Animal perro2 = new Animal("Teddy","Croquetas",10,"Chihuahua");
        animal.add(perro2);
        perro2.alimento();
        
        //Declaracion del objeto Gato
        Animal gato1 = new Animal("Pelusa","Galletas",15,"Siames");
        animal.add(gato1);
        gato1.alimento();
        
        //Declaracion del objeto Caballo
        Animal caballo1 = new Animal("Spark","Pasto",25,"Fino");
        animal.add(caballo1);
        caballo1.alimento();
        
        //MOstrar listado
        for (Animal aux : animal) {
            System.out.println(aux.getClass()+" "+aux.alimento());
        }
    }
    
}
