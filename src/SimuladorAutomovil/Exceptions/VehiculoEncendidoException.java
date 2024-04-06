package SimuladorAutomovil.Exceptions;

/**
 * 
 * @author Samuel David López Sarabia
 */
public class VehiculoEncendidoException extends RuntimeException {

    public VehiculoEncendidoException() {
        super("ERROR: El vehiculo ya se encuentra encendido.");
    }
    
}
