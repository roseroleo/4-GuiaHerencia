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
        double valorLav = 0;
        double valorTvs = 0;

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
                        valorLav += mabe.getPrecio();
                        break;
                    case 2:
                        sanyo.crearTelevisor();
                        sanyo.precioFinal();
                        electro.add(sanyo);
                        valorTvs += sanyo.getPrecio();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no valida");
                }

            } catch (Exception e) {
                System.out.println("Error " + e);
                break;
            }
        }
        for (Electrodomestico aux : electro) {
            System.out.println(aux.toString());
        }
        System.out.println("Valor total lavadoras = " + valorLav);
        System.out.println("Valor total televisores ) " + valorTvs);
        System.out.println("Valor total electrodomesticos = " + (valorLav + valorTvs));

//    Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//    deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//    televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//    precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//    2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//    electrodomésticos, 2000 para lavadora y 5000 para televisor.
    }
}
