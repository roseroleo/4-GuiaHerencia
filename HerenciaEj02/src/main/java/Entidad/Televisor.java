/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados. 
Los constructores que se implementarán serán: 
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre. 
Los métodos que se implementara serán: 
• Método get y set de los atributos resolución y sintonizador TDT. 
 */
public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, Double precio, String color, Character consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor{" + "precio=" + precio + ", color="
                + color + ", consumo=" + consumo + ", peso="
                + peso + ", resolucion=" + resolucion + ", TDT=" + tdt + '}';
    }

//Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor. 
    public void crearTelevisor() {
        Scanner lr = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("Resolucion ");
        this.resolucion = lr.nextInt();
        System.out.println("TDT 'S/N'");
        String r = lr.next();
        if (r.equalsIgnoreCase("S")) {
            this.tdt = true;
        } else {
            this.tdt = false;
        }
    }

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico();
    }

//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio. 
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 30) {
            this.precio = this.precio * 1.3;
        }
        if (tdt) {
            this.precio += 500;
        }
    }
}
