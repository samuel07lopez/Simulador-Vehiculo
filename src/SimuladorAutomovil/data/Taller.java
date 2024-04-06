package SimuladorAutomovil.data;

import SimuladorAutomovil.Classes.*;

/**
 *
 * @author Samuel David López Sarabia
 */
public class Taller {
    
    private Lector lector;
    private static final String PATH = "/home/sam/Sam's_pc/Documentos/Programming/JAVA/Simulador/SimuladorAutomovil/src/main/java/SimuladorAutomovil/data/caracteristicas.txt";

    public Taller() {
        this.lector = new Lector();
    }
    
    public void modificarVehiculo(Vehiculo vehiculo){
        Llanta llantas = null;
        Motor motor = null;
        
        String[] caracteristicas = lector.leer(PATH);
        switch (caracteristicas[0]){
            case "baratas":
                llantas = new LlantaBarata();
            case "bonitas":
                llantas = new LlantaBonita();
            case "buenas":
                llantas = new LlantaBuena();
        }
        switch (caracteristicas[1]){
            case "1000":
                motor = new MotorMil();
            case "2000":
                motor = new MotorDosMil();
            case "3000":
                motor = new MotorTresMil();
        }
        vehiculo.setLlantas(llantas);
        vehiculo.setMotor(motor);
    }
}
