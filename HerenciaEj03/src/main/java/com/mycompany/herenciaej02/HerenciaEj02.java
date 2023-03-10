/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.herenciaej02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.  
 */
public class HerenciaEj02 {

    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        ArrayList<Electrodomestico> electro = new ArrayList();
        boolean salir = false;
        String resp;
        while (!salir) {
            //Crear electrodomesticos y agregarlos a un ArrayList
            Lavadora mabe = new Lavadora();
            Televisor sanyo = new Televisor();
            System.out.println("**** INGRESAR ELECTRODOMESTICO ****");
            System.out.println("1. Lavadora");
            System.out.println("2. Televisor");
            System.out.println("3. Salir");
            try {

                int rp = lr.nextInt();
                switch (rp) {
                    case 1:
                        mabe.crearLavadora();
                        mabe.precioFinal();
                        electro.add(mabe);
                        break;
                    case 2:
                        sanyo.crearTelevisor();
                        sanyo.precioFinal();
                        electro.add(sanyo);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
        for (Electrodomestico aux : electro) {
            System.out.println(aux.toString());
        }

    }

}
