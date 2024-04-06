package SimuladorAutomovil.Exceptions;

/**
 * 
 * @author Samuel David López Sarabia
 */
public class VehiculoApagadoException extends RuntimeException {

    public VehiculoApagadoException() {
        super("ERROR: El vehiculo ya se encuentra apagado.");
    }
    
}
