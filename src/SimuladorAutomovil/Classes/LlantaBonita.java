package SimuladorAutomovil.Classes;

/**
 *
 * @author Samuel David López Sarabia
 */
public class LlantaBonita extends Llanta {
    public static final double LIMITE = 70;

    public LlantaBonita() {
    }
    
    @Override
    public double getLimite() {
        return LIMITE;
    }
}
