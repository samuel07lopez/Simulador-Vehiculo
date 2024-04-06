/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimuladorAutomovil.Exceptions;

/**
 *
 * @author Samuel David López Sarabia
 */
public class VehiculoAccidentadoAccionException extends RuntimeException {

    public VehiculoAccidentadoAccionException() {
        super("¡¡¡No es posible realizar la acción, el vehiculo está accidentado!!!");
    }
}
