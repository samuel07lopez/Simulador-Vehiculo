package SimuladorAutomovil.Exceptions;

/**
 * 
 * @author Samuel David López Sarabia
 */
public class VehiculoFrenadoBruscoException extends RuntimeException {

    public VehiculoFrenadoBruscoException() {
        super("Se freno bruscamente y la velocidad es superior al limite de las llantas, el vehiculo esta patinando.");
    }
    
}
