/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Estudiante
 */
public class ExcepcionNombre extends Exception{

    public ExcepcionNombre() {
        super("El nombre es demasiado corto, ingrese uno con una cantidad mayor a diez (10) caracteres.");
    }

    
}
