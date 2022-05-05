/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 *Clase que crea la excepción IngresoMayorAVeinteMil
 * @author alumno
 */
public class IngresoMayorAVeinteMil extends Exception{
    /**
     * Constructor con atributo
     * @param mensaje cadena de texto que explica el error
     */
    public IngresoMayorAVeinteMil(String mensaje){
        super(mensaje);
    }
}
