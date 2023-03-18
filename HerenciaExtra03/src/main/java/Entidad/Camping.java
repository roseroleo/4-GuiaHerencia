/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. 
 */
public class Camping extends AlojExtrahotelero {
    public int cantCarpas;
    public boolean restaurante;

    public Camping() {
    }

    public Camping(int cantCarpas, boolean restaurante, boolean privado, int area, String nombre, String direccion, String localidad, String gerente) {
        super(privado, area, nombre, direccion, localidad, gerente);
        this.cantCarpas = cantCarpas;
        this.restaurante = restaurante;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantCarpas=" + cantCarpas + ", restaurante=" + restaurante + '}';
    }
    
}
