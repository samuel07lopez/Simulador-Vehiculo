package SimuladorAutomovil.Exceptions;

/**
 * 
 * @author Samuel David López Sarabia
 */
public class VehiculoApagadoAccionException extends RuntimeException {

    public VehiculoApagadoAccionException() {
        super("ERROR: No es posible realizar la accion ya que el vehiculo se encuentra apagado.");
    }
    
}
