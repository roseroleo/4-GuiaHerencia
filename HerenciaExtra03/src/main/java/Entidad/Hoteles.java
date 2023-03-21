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
public abstract class Hoteles extends Alojamientos {
    
    //Atributos generales de un hotel
    public String direccion;
    public String localidad;
    public String gerente;
    public int cantHab;
    public int numCamas;
    public int cantPisos;
    public double precioHab;

    public Hoteles() {
    }

    public Hoteles(int cantHab, int numCamas, int cantPisos, double precioHab, Hoteles hoteles, Alojamientos extrahoteleros, String direccion, String localidad, String gerente) {
        super(hoteles, extrahoteleros, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

   
    @Override
    public String toString() {
        return "Hoteles{" + "cantHab=" + cantHab + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHab=" + precioHab + '}';
    }

    //Metodo abstracto
    public abstract void CalcularPrecio();
}
