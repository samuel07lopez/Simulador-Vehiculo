package SimuladorAutomovil.Exceptions;

/**
 *
 * @author Samuel David López Sarabia
 */
public class VehiculoPatinandoAccionException extends RuntimeException {

    public VehiculoPatinandoAccionException() {
        super("¡¡¡El vehiculo está patinando, no puedes hacer esto!!!");
    }
    
}
