/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos:  Hoteles y Alojamientos Extrahoteleros. 
 */
public abstract class Alojamientos {
    public Hoteles hoteles;
    public Alojamientos extrahoteles;
    

    public Alojamientos() {
    }

    public Alojamientos(Hoteles hoteles, Alojamientos extrahoteles) {
        this.hoteles = hoteles;
        this.extrahoteles = extrahoteles;
    }


}
    