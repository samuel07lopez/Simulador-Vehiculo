package SimuladorAutomovil.Exceptions;

/**
 *
 * @author Samuel David López Sarabia
 */
public class IntensidadMenorCeroException extends RuntimeException {

    public IntensidadMenorCeroException() {
        super("ERROR: La intensidad no puede ser menor a cero.");
    }
    
}
