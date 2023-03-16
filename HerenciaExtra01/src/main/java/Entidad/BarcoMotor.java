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

    @Override
    public double Modulo() {
        System.out.println("eslora "+super.getEslora());
        double mMotor = super.getEslora() * 10 + potencia;
        return mMotor;
    }
}


