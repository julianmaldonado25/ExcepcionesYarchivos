/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerexcepciones;

import Excepciones.ExcepcionSalario;
import Excepciones.ExceptionLenguaje;
import Excepciones.ExcepcionNombre;

/**
 *
 * @author Estudiante
 */
public class Programador extends Empleado{
    protected String lenguaje;

    public Programador(String lenguaje, String nombre, double salario, int id)
            throws ExcepcionNombre, ExcepcionSalario, ExceptionLenguaje {
        super(nombre, salario, id);
        
        if(lenguaje.equals("Go"))
            throw new ExceptionLenguaje();
        
        
        
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
        double calcSalario = this.salario;
        if(this.lenguaje.equals("java")){
            calcSalario += this.salario*0.2;
        return calcSalario;
        }
        
        
        return 0;
    }

    @Override
    public String listarInformacion() {
        return "Programador "+this.id+" "+this.nombre+ " que usa lenguaje "+this.lenguaje+ " gana: "+this.calcularSalario()+" pesos.";
    }
    
    
    
}
