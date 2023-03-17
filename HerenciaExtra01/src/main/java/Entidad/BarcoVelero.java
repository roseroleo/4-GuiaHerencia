package Entidad;

public class BarcoVelero extends Barco {

    private Integer numMastiles;

    public BarcoVelero() {
    }

    public BarcoVelero(Integer numMastiles, String nombreBarco, String matricula, Integer eslora, Integer anio) {
        super(nombreBarco, matricula, eslora, anio);
        this.numMastiles = numMastiles;
    }

    public Integer getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(Integer numMastiles) {
        this.numMastiles = numMastiles;
    }

    //Calcular precio base por alquiler
    @Override
    public double Modulo() {
        double mVelero = super.eslora * 10 + numMastiles;
        return mVelero;
    }
    
}