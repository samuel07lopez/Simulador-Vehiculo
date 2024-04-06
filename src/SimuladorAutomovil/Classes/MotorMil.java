package SimuladorAutomovil.Classes;

/**
 *
 * @author Samuel David López Sarabia
 */
public class MotorMil extends Motor {
    public static final double VELOCIDAD_MAXIMA = 100;

    public MotorMil() {
    }    

    @Override
    public double getVelocidadMaxima() {
        return VELOCIDAD_MAXIMA;
    }
    
}
