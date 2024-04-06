package SimuladorAutomovil.Classes;

import SimuladorAutomovil.Exceptions.*;

/**
 *
 * @author Samuel David López Sarabia
 */
public class Vehiculo {
    
    private double velocidad;
    private boolean accidentado;
    private boolean patinando;
    private Llanta llantas;
    private Motor motor;

    public Vehiculo(){
        this.velocidad = 0;
        this.accidentado= false;
        this.patinando = false;
        this.llantas = null;
        this.motor = null;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public Llanta getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta llantas) {
        this.llantas = llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public boolean isAccidentado() {
        return accidentado;
    }

    public boolean isPatinando() {
        return patinando;
    }
    
    public boolean isEncendido(){
        return this.motor.isEncendido();
    }
    
    public void encender() throws VehiculoAccidentadoAccionException, VehiculoEncendidoException {
        if(this.accidentado){
            throw new VehiculoAccidentadoAccionException();
        }
        this.motor.encender();
    }
    
    public void apagar()throws VehiculoAccidentadoAccionException, VehiculoAccidentadoException, VehiculoApagadoException {
        if(this.accidentado){
            throw new VehiculoAccidentadoAccionException();
        }
        else if(this.velocidad > 0){
            if(this.velocidad >= 60){
                this.accidentado = true;
                this.motor.apagar();
                this.velocidad = 0;
                throw new VehiculoAccidentadoException("El vehiculo se ha accidentado");
            }
            this.velocidad = 0;
            this.motor.apagar();
        }
        else this.motor.apagar();
    }
    
    public void acelerar(double intensidad)throws VehiculoAccidentadoAccionException, VehiculoApagadoAccionException, VehiculoPatinandoAccionException, IntensidadMenorCeroException, LimiteLlantasException {
        if(accidentado){
            throw new VehiculoAccidentadoAccionException();
        }
        else if(!this.motor.isEncendido()){ 
            throw new VehiculoApagadoAccionException();
        }
        else if(this.patinando){
            throw new VehiculoPatinandoAccionException();
        }
        else {
            double nuevaVelocidad = this.velocidad+intensidad;
            if(intensidad<0) throw new IntensidadMenorCeroException();
            else if(nuevaVelocidad >= this.motor.getVelocidadMaxima()){
                this.motor.apagar();
                this.velocidad = 0;
                this.accidentado = true;
                throw new VehiculoAccidentadoException("¡El vehiculo se ha accidentado ya que la velocidad supero el limite del motor!");
            }
            else if(nuevaVelocidad >= this.llantas.getLimite()){
                this.velocidad = nuevaVelocidad;
                this.patinando = true;
                throw new LimiteLlantasException("El limite de las llantas ha sido superado, el vehiculo está patinando.");
            }
            else this.velocidad = nuevaVelocidad;
        }
    }
    
    public void frenar(double intensidad)throws VehiculoAccidentadoAccionException, VehiculoApagadoAccionException, VehiculoDetenidoException, IntensidadMenorCeroException, VehiculoPatinandoException, VehiculoPatinandoAccionException, VehiculoFrenadoBruscoException {
        if (accidentado) throw new VehiculoAccidentadoAccionException();
        else if(!this.motor.isEncendido()) throw new VehiculoApagadoAccionException();
        else{
            if(this.velocidad == 0) throw new VehiculoDetenidoException();
            else if(intensidad < 0) throw new IntensidadMenorCeroException();
            else if(intensidad > this.velocidad){
                this.patinando = true;
                throw new VehiculoPatinandoException();
            }
            else if(intensidad > 30 & this.llantas.getLimite() < this.velocidad){
                this.patinando = true;
                throw new VehiculoFrenadoBruscoException();
            }
            else this.velocidad -= intensidad;
        }
    }
}