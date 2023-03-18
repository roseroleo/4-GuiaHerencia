/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.  Las
características de las distintas categorías son las siguientes:  
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.  
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas
 */
public abstract class Hoteles {
    public int cantHab;
    public int numCamas;
    public int cantPisos;
    public double precioHab;

    public Hoteles() {
    }

    public Hoteles(int cantHab, int numCamas, int cantPisos, double precioHab) {
        this.cantHab = cantHab;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }

    @Override
    public String toString() {
        return "Hoteles{" + "cantHab=" + cantHab + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHab=" + precioHab + '}';
    }
    
    //Metodo abstracto
    public abstract void CalcularPrecio();
}
