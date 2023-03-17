package Entidad;


public class BarcoMotor extends Barco {

    public Integer potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potencia, String nombreBarco, String matricula, Integer eslora, Integer anio) {
        super(nombreBarco, matricula, eslora, anio);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    //Calcular precio base por alquiler    
    @Override
    public double Modulo() {
        double mMotor = super.eslora * 10 + potencia;
        return mMotor;
    }
    
}


