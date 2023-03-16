package Entidad;

import java.util.Date;
import java.time.LocalDate;

public abstract class Barco {
    
    public String nombreBarco;
    public String matricula;
    public Integer eslora;
    public Integer anio;

    public Barco() {
    }

    public Barco(String nombreBarco, String matricula, Integer eslora, Integer anio) {
        this.nombreBarco = nombreBarco;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    //Metodo comun para todos los barcos
    public abstract double Modulo() ;
//        double precioBase = eslora*10;
//        return precioBase;
//    }

    @Override
    public String toString() {
        return "Barco{" + "nombreBarco=" + nombreBarco + ", matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + '}';
    }

}
