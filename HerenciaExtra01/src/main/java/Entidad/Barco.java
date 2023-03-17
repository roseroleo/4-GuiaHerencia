package Entidad;

public abstract class Barco {
    
    public String nombreBarco;
    public String matricula;
    protected int eslora;
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

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
//    Metodo comun para todos los barcos precio base
    public abstract double Modulo();

    @Override
    public String toString() {
        return "Barco{" + "nombreBarco=" + nombreBarco + ", matricula=" + matricula + ", eslora=" + eslora + ", anio=" + anio + '}';
    }

}
