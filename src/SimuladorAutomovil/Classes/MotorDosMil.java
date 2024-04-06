/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimuladorAutomovil.Classes;

/**
 *
 * @author Samuel David López Sarabia
 */
public class MotorDosMil extends Motor {
    public static final double VELOCIDAD_MAXIMA = 160;

    public MotorDosMil() {
    }

    @Override
    public double getVelocidadMaxima() {
        return VELOCIDAD_MAXIMA;
    }
}
