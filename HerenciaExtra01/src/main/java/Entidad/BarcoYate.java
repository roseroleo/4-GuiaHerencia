package Entidad;

public class BarcoYate extends Barco {

    private Integer potencia;
    private Integer numCamarotes;

    public BarcoYate() {
    }

    public BarcoYate(Integer potencia, Integer numCamarotes, String nombreBarco, String matricula, Integer eslora, Integer anio) {
        super(nombreBarco, matricula, eslora, anio);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public double Modulo() {
        double mYate = getEslora()*10+potencia+numCamarotes;
        return mYate;
    }
}
