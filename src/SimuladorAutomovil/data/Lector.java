package SimuladorAutomovil.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Samuel David López Sarabia
 */
public class Lector {
    public String[] leer(String path){
        try {
            String[] resultado = new String[2];
            FileReader fr = new FileReader(path);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linea;
                while((linea=br.readLine())!=null){
                    String[] partes = linea.split("\\s+");
                    if(partes.length == 2){
                        String clave = partes[0];
                        String valor = partes[1];
                        if(clave.equals("llantas") | clave.equals("Llantas")){
                            resultado[0] = valor;
                        }
                        else if(clave.equals("motor") | clave.equals("Motor")){
                            resultado[1] = valor;
                        }
                    }
                }
            }
            return resultado;
        }
        catch(IOException e){
            System.out.println("ERROR");
        }
        return null;
    }
    // public static void main(String[] args){
    //     Lector lector = new Lector();
    //     String llantas = null;
    //     String motor = null;
    //     String[] resultado = lector.leer("/home/sam/Sam's_pc/Documentos/Programming/JAVA/Simulador/SimuladorAutomovil/src/main/java/SimuladorAutomovil/data/caracteristicas.txt");
    //     llantas = resultado[0];
    //     motor = resultado[1];
    //     System.out.println(llantas);
    //     System.out.println(motor);
    // }
}