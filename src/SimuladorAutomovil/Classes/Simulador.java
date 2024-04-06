package SimuladorAutomovil.Classes;

import SimuladorAutomovil.Exceptions.*;
import SimuladorAutomovil.data.Taller;

/**
 *
 * @author Samuel David López Sarabia
 */
public class Simulador {
    
    private Vehiculo vehiculo;
    private Taller taller;

    public Simulador(int MAXIMIZED_BOTH, int PROPERTIES) {
        this.vehiculo = new Vehiculo();
        this.taller = new Taller();
        taller.modificarVehiculo(vehiculo);
    }
    public boolean isAccidentado(){
        return this.vehiculo.isAccidentado();
    }
    
    public boolean isEncendido(){
        return this.vehiculo.isEncendido();
    }
    
    public String enceder(){
        try{
            this.vehiculo.encender(); 
            return "Su auto ha encendido";
        }
        catch(VehiculoAccidentadoAccionException e){
            return e.getMessage();
        }
        catch(VehiculoEncendidoException e){
            return e.getMessage();
        }
    }
    
    public String apagar(){
        try{
            this.vehiculo.apagar();
            return "Su auto se ha apagado";
        }
        catch(VehiculoAccidentadoAccionException e){
            return e.getMessage();
        }
        catch(VehiculoAccidentadoException e){
            return e.getMessage();
        }
        catch(VehiculoApagadoException e){
            return e.getMessage();
        }
    }
    
    public String[] acelerar(double intensidad){
        String[] resultado = new String[2];
        try {
            this.vehiculo.acelerar(intensidad);
            resultado[0] = "El auto ha acelerado";
            resultado[1] = "";
            return resultado;
        }
        catch (VehiculoAccidentadoAccionException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "El vehiculo está accidentado";
            return resultado;
        }
        catch(VehiculoAccidentadoException e){
            resultado[0] = e.getMessage();
            resultado[1] = "El vehiculo está accidentado";
            return resultado;
        }
        catch (VehiculoApagadoAccionException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "El vehiculo está apagado";
            return resultado;
        }
        catch (VehiculoPatinandoException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "El vehiculo está patinando";
            return resultado;
        }
        catch (IntensidadMenorCeroException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "";
            return resultado;
        }
        catch (LimiteLlantasException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "";
            return resultado;
        }
    }
    
    public String[] frenar(double intensidad){
        String[] resultado = new String[2];
        try {
            this.vehiculo.frenar(intensidad);
            resultado[0] = "Se ha frenado con exito";
            resultado[1] = "";
            return resultado;
        }
        catch (VehiculoAccidentadoAccionException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "El vehiculo está accidentado";
            return resultado;
        }
        catch (VehiculoAccidentadoException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "El vehiculo está accidentado";
            return resultado;
        }
        catch (VehiculoApagadoAccionException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "";
            return resultado;
        }
        catch (VehiculoDetenidoException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "";
            return resultado;
        }
        catch (IntensidadMenorCeroException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "";
            return resultado;
        }
        catch (VehiculoPatinandoException e) {
            resultado[0] = e.getMessage();
            resultado[1] = "¡¡El vehiculo está patinando!!";
            return resultado;
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}