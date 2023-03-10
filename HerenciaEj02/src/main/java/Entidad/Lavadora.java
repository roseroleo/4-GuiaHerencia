/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    protected int carga;
    
    public Lavadora() {
    }

    public Lavadora(int carga, Double precio, String color, Character consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", carga=" + carga + '}';
    }

//Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora
    public void crearLavadora() {
        Scanner lr = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("Capacidad ");
        int capacidad = lr.nextInt();
        this.carga = capacidad;
    }

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico();  
    }

//Método precioFinal():  este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (this.carga > 30) {
            this.precio += 500;
        } 
    }
}
