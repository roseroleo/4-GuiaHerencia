/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso. 
Los constructores que se deben implementar son los siguientes: 
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro
 */
public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

//    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//    precio se le da un valor base de $1000. 
    public void crearElectrodomestico() {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        System.out.println("*** INGRESAR ELECTRODOMESTICO***");
//            System.out.println("Nombre ");
//            String nombre = lr.next();
        System.out.println("Color ");
        comprobarColor(lr.next());
        System.out.println("Consumo letras A a la F ");
        comprobarConsumoEnergetico(lr.next().toUpperCase().charAt(0));
        System.out.println("Peso ");
        int peso = lr.nextInt();
        this.peso = peso;
        this.precio = 1000.0;
    }

//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//    precio. Esta es la lista de precios: 
//    A   1000        Entre 1 y 19kg      100
//    B   800         Entre 20 y 49kg     500
//    C   600         Entre 50 y 79kg     800
//    D   500         Mayor que 80kg      1000
//    E   300     
//    F   100
    public void precioFinal() {
        switch (consumo) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        if (getPeso() < 20) {
            this.precio += 100;
        } else if (getPeso() < 50) {
            setPrecio(getPeso() + 500.0);
        } else if (this.peso < 80) {
            setPrecio(this.precio + 800);
        } else {
            this.precio += 1000;
        }
    }
//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//    objeto y no será visible.  

    protected void comprobarConsumoEnergetico(char letra) {
        if (letra < 64 || letra > 71) {
            letra = 70;
        }
        this.consumo = letra;
    }

//    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//    minúsculas. Este método se invocará al crear el objeto y no será visible.
    protected void comprobarColor(String c) {
        String[] colores = new String[]{"blanco", "negro", "rojo", "azul", "gris"};
        String c1 = "blanco";
        for (int i = 0; i < colores.length; i++) {
            if (c.equals(colores[i])) {
                c1 = c;
                break;
            } 
        }
        this.color = c1;
    }
}
