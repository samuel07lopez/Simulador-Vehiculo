package SimuladorAutomovil.Classes;

/**
 *
 * @author Samuel David López Sarabia
 */
public class LlantaBuena extends Llanta {
    public static final double LIMITE = 110;

    public LlantaBuena() {
    }

    @Override
    public double getLimite() {
        return LIMITE;
    }
}
