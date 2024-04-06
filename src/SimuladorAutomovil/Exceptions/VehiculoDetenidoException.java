package SimuladorAutomovil.Exceptions;

/**
 * 
 * @author Samuel David López Sarabia
 */
public class VehiculoDetenidoException extends RuntimeException {

    public VehiculoDetenidoException() {
        super("ERROR: No es posible frenar el vehiculo dado que está detenido.");
    }
    
}
