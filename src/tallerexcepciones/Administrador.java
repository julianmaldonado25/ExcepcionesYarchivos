/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerexcepciones;

import Excepciones.ExcepcionSalario;
import Excepciones.ExcepcionNombre;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Empleado {

    public Administrador(String nombre, int id) 
            throws ExcepcionNombre, ExcepcionSalario {
        
        super(nombre, 1000000, id);
    }

    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String listarInformacion() {
    return "Administrador: "+ this.id+", llamado: "+this.nombre+" con sueldo de "+this.salario+" pesos.";
    }
    
    
    
    
}
