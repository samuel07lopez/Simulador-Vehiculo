package SimuladorAutomovil.Exceptions;

/**
 * 
 * @author Samuel David López Sarabia
 */
public class VehiculoPatinandoException extends RuntimeException {

    public VehiculoPatinandoException() {
        super("La intensidad del frenado es superior a la velocidad, el vehiculo está patinando.");
    }
    
}
