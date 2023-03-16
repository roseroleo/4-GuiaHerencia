/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.BarcoVelero;
import Entidad.BarcoYate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author roser
 */
public class ServicioAlquiler {

    public void CrearAlquiler() {

        //Crear un listado de alquileres
        ArrayList<Alquiler> alquiler = new ArrayList<>();
        
        //Lista de barcos
        BarcoYate y1 = new BarcoYate(300, 12, "La Pinta", "P0001", 30, 1990);
        BarcoVelero v1 = new BarcoVelero(2, "La Niña", "V002", 70, 1970);
        BarcoMotor m1 = new BarcoMotor (85, "Reina Isabel", "M003", 30, 2000);
        BarcoVelero v2 = new BarcoVelero(1, "La Santa Maria", "V004", 50, 1980);
        
        //Lista de alquileres
        Alquiler a1 = new Alquiler("Juan", 1001, "01/01/2023", "30/01/2023", "A", y1);
        Alquiler a2 = new Alquiler("Pedro", 1002, "01/01/2023", "25/01/2023", "B", v1);
        Alquiler a3 = new Alquiler("Jose", 1003, "01/01/2023", "20/01/2023", "D", m1);
        Alquiler a4 = new Alquiler("Rosa", 1004, "01/01/2023", "15/01/2023", "H", v2);
        
        //Adicionar alquileres
        alquiler.add(a1);
        alquiler.add(a2);
        alquiler.add(a3);
        alquiler.add(a4);

        //Mostrar el listado
        for (Alquiler aux : alquiler) {
            System.out.println(aux.toString());
        }
    }

    //Calcular el tiempo de alquiler
    public long tiempoAlquiler() {
        ArrayList<Alquiler> alquiler = new ArrayList<>();
        Iterator<Alquiler> it = alquiler.iterator();
        
//        Alquiler a = new Alquiler();
        
        System.out.println("fecha i "+a.getFechaAlquiler());
        
        //Dar formato a la fecha y llamar las fechas ingresadas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicial = LocalDate.parse(a.fechaAlquiler.toString(), formatter);
        LocalDate fechaFinal = LocalDate.parse(a.fechaDevolucion.toString(), formatter);
        //Calcular el tiempo de alquiler
        long diasAlquiler = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
        System.out.println("dias alquiler ="+diasAlquiler);
        return diasAlquiler;
    }

    //Calcular el valor del alquiler
    public double alquilerBarco(int n) {
        double valorAlquiler = 0;
        if (n == 1) {
            tiempoAlquiler();
//            BarcoMotor bM = new BarcoMotor();
//            
//            System.out.println("bbb"+bM.toString());
//            valorAlquiler = bM.Modulo() * this.tiempoAlquiler();
        }
        if (n == 2) {
            BarcoVelero bV = new BarcoVelero();
            valorAlquiler = bV.Modulo() * this.tiempoAlquiler();
        }
        if (n == 3) {
            BarcoYate bY = new BarcoYate();
            valorAlquiler = bY.Modulo() * this.tiempoAlquiler();
        }
        return valorAlquiler;
    }
    
}
