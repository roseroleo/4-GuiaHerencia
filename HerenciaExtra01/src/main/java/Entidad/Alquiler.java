package Entidad;

import java.time.LocalDate;
import java.util.Date;

public class Alquiler {

    public String nombreCliente;
    public Integer documentoCliente;
    public String fechaAlquiler;
    public String fechaDevolucion;
    public String posicionAmarre;
    public Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombreCliente, Integer documentoCliente, String fechaAlquiler, String fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(Integer documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombreCliente=" + nombreCliente + ", documentoCliente=" + documentoCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevlucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
}
