/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Electrodomestico;
import java.util.Scanner;

public class ServicioElectrodomestico {

//    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//    precio se le da un valor base de $1000. 
    public Electrodomestico crearElectrodomestico() {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        System.out.println("*** INGRESAR ELECTRODOMESTICO***");
//            System.out.println("Nombre ");
//            String nombre = lr.next();
        System.out.println("Color ");
        String color = comprobarColor(lr.next());
        System.out.println("Consumo letras A a la F ");
        char consumo = comprobarConsumoEnergetico(lr.next().toUpperCase().charAt(0));
        System.out.println("Peso ");
        int peso = lr.nextInt();
        return new Electrodomestico(1000.0, color, consumo, peso);
    }

//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//    precio. Esta es la lista de precios: 
//    A   1000        Entre 1 y 19kg      100
//    B   800         Entre 20 y 49kg     500
//    C   600         Entre 50 y 79kg     800
//    D   500         Mayor que 80kg      1000
//    E   300     
//    F   100
    public void precioFinal(Electrodomestico e) {
        switch (e.getConsumo()) {
            case 'A':
                e.setPrecio(e.getPrecio() + 1000);
                break;
            case 'B':
                e.setPrecio(e.getPrecio() + 800);
                break;
            case 'C':
                e.setPrecio(e.getPrecio() + 600);
                break;
            case 'D':
                e.setPrecio(e.getPrecio() + 500);
                break;
            case 'E':
                e.setPrecio(e.getPrecio() + 300);
                break;
            case 'F':
                e.setPrecio(e.getPrecio() + 100);
                break;
        }
        if (e.getPeso() < 20) {
            e.setPrecio(e.getPrecio() + 100);
        } else if (e.getPrecio() < 50) {
            e.setPrecio(e.getPrecio() + 500);
        } else if (e.getPrecio() < 80) {
            e.setPrecio(e.getPrecio() + 800);
        } else {
            e.setPrecio(e.getPrecio() + 1000);
        }
    }
    
    //    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    //    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    //    objeto y no será visible.  

    public char comprobarConsumoEnergetico(char letra) {
        if (letra < 64 || letra > 71) {
            letra = 70;
        }
        return letra;
    }

//    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//    minúsculas. Este método se invocará al crear el objeto y no será visible.
    public String comprobarColor(String c) {
        String[] color = new String[]{"blanco", "negro", "rojo", "azul", "gris"};
        for (int i = 0; i < color.length; i++) {
            if (!c.equals(color[i])) {
                c = "blanco";
            }
        }
        return c;
    }
}
