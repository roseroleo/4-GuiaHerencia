/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.BarcoMotor;
import Entidad.BarcoVelero;
import Entidad.BarcoYate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ServicioAlquiler {

    //Crear un listado de alquileres
    ArrayList<Alquiler> alquiler = new ArrayList<>();
    //Instanciar tipos de barco
    BarcoMotor m1;  
    BarcoVelero v1;
    BarcoYate y1;
    public void CrearAlquiler() {

        //Datos de barcos
        m1 = new BarcoMotor(85, "Reina Isabel", "M003", 70, 2000);
        v1 = new BarcoVelero(2, "La Niña", "V002", 30, 2020);
        y1 = new BarcoYate(300, 12, "La Pinta", "Y001", 20, 2010);
        
        //DAtos de alquileres
        alquiler.add(new Alquiler("Jose", 1003, "01/03/2023", "20/03/2023", "D", m1));
        alquiler.add(new Alquiler("Rosa", 1002, "01/02/2023", "25/02/2023", "B", v1));
        alquiler.add(new Alquiler("Juan", 1001, "01/01/2023", "30/01/2023", "A", y1));
        
        //Mostrar el listado
        for (Alquiler aux : alquiler) {
            System.out.println(aux.toString());
        }
    }

    //Calcular el tiempo de alquiler
    public long tiempoAlquiler(int n) {
        
        //Dar formato a la fecha y llamar las fechas ingresadas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicial = LocalDate.parse(alquiler.get(n - 1).fechaAlquiler, formatter);
        LocalDate fechaFinal = LocalDate.parse(alquiler.get(n - 1).fechaDevolucion, formatter);
        
        //Calcular el tiempo de alquiler
        long diasAlquiler = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
        return diasAlquiler;
    }

    //Calcular el valor del alquiler
    public void alquilerBarco(int n) {
        double valorAlquiler = 0;
        CrearAlquiler(); //LLamar los datos de alquileres
        if (n == 1) {
            valorAlquiler = m1.Modulo() * tiempoAlquiler(n);
        }
        if (n == 2) {
            valorAlquiler = v1.Modulo() * tiempoAlquiler(n);
        }
        if (n == 3) {
            valorAlquiler = y1.Modulo() * tiempoAlquiler(n);
        }
        System.out.println("Valor del alquiler " + valorAlquiler);
    }
}
