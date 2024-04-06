package SimuladorAutomovil.Classes;

/**
 *
 * @author Samuel David López Sarabia
 */
public class LlantaBarata extends Llanta {
    public static final double LIMITE = 50;

    public LlantaBarata() {
    }

    @Override
    public double getLimite() {
        return LIMITE;
    }
    
}
