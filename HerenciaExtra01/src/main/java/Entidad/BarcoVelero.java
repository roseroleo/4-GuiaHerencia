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

    @Override
    public double Modulo() {
        System.out.println("Eslora "+getEslora()+" Mastiles = "+numMastiles);
//        double mVelero = getEslora() * 10 + numMastiles;
        return 0;
    }
    
}