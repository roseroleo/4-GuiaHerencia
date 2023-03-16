/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.herenciaextra01;

import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.BarcoVelero;
import Entidad.BarcoYate;
import Servicio.ServicioAlquiler;
import java.util.Scanner;

/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.  
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación. 
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo. 
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora). 
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes. 
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler. 
 */
public class HerenciaExtra01 {

    public static void main(String[] args) {
        ServicioAlquiler sA = new ServicioAlquiler();
        Scanner lr = new Scanner(System.in);
        sA.CrearAlquiler();
        System.out.println("**** ALQUILER DE AMARRES PARA VARCO ***\n");
        System.out.println("Ingrese el tipo de barco");
        System.out.println("1- Barco Motor");
        System.out.println("2- Barco Velero");
        System.out.println("3- Barco Yate");
        int resp = lr.nextInt();
        switch (resp) {
            case 1:
//                Barco bM = new BarcoMotor();
                System.out.println("Valor del alquiler "+sA.alquilerBarco(1));
                break;
            case 2:
                Barco bV = new BarcoVelero();
                System.out.println("Valor del alquiler "+sA.alquilerBarco(2));
                break;
            case 3:
                Barco bY = new BarcoYate();
                System.out.println("Valor del alquiler "+sA.alquilerBarco(3));
                break;
        }
    }
}
