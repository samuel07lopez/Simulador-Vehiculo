package SimuladorAutomovil.Classes;

import SimuladorAutomovil.Exceptions.*;

/**
 *
 * @author Samuel David López Sarabia
 */
public abstract class Motor {
    private boolean encendido;

    public Motor() {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }
    
    public void encender()throws VehiculoEncendidoException {
        if (!this.encendido) {
            this.encendido = true;
        } else {
            throw new VehiculoEncendidoException();
        }
    }
    
    public void apagar()throws VehiculoApagadoException {
        if (this.encendido) {
            this.encendido =  false;
        } else {
            throw new VehiculoApagadoException();
        }
    }
    
    public abstract double getVelocidadMaxima();
}
