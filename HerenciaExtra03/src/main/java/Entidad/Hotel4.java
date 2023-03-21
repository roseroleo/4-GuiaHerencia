/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*/*Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.  Las
características de las distintas categorías son las siguientes:  
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.  
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas
 */
public class Hotel4 extends Hoteles {

    public String gimnasio;
    public String nomRestaurante;
    public int capRestaurante;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nomRestaurante, int capRestaurante, int cantHab, int numCamas, int cantPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(cantHab, numCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nomRestaurante = nomRestaurante;
        this.capRestaurante = capRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNomRestaurante() {
        return nomRestaurante;
    }

    public void setNomRestaurante(String nomRestaurante) {
        this.nomRestaurante = nomRestaurante;
    }

    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(int capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "gimnasio=" + gimnasio + ", nomRestaurante=" + nomRestaurante + ", capRestaurante=" + capRestaurante + '}';
    }

    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
    Donde: 
    Valor agregado por el restaurante: 
    • $10 si la capacidad del restaurante es de menos de 30 personas.
    • $30 si está entre 30 y 50 personas. 
    • $50 si es mayor de 50. 
    Valor agregado por el gimnasio: 
    • $50 si el tipo del gimnasio es A. 
    • $30 si el tipo del gimnasio es B. 
    Valor agregado por las limosinas: 
    • $15 por la cantidad de limosinas del hotel.*/
    
    //Calcular precio de la habitacion
    @Override
    public void CalcularPrecio() {
        //Cantidad de Habitaciones, Número de camas, Cantidad de Pisos
        double PrecioHab;
        this.precioHab = 50 + (this.getCantHab() * this.numCamas * this.cantPisos) + ValorAgregadoRestaurante() + ValorAgregadoGimansio();
    }

    //Calcular valor agregado por capacidad de restaurante
    public int ValorAgregadoRestaurante() {
        int valorAgrRest = (capRestaurante < 30) ? 10 : (capRestaurante < 51) ? 30 : 50;
        return valorAgrRest;
    }

    //Calcular valor agregado por tipo de gimnasio
    public int ValorAgregadoGimansio() {
        int valorAgrGimm = (gimnasio == "A") ? 50 : 30;
        return valorAgrGimm;
    }

}
