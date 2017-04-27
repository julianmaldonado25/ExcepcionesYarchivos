/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerexcepciones;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private ArrayList<Trabajador> trabajadores;

    public Empresa() {
    this.trabajadores = new ArrayList<>();
    
    }
    public void agregarTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }
    public double calcularSalarioTotal(){
        double salarioTotal= 0;
        for(Trabajador t: trabajadores){
            salarioTotal += t.calcularSalario();
        }
        
        return salarioTotal;
    }
    
    public String listarInformacion(){
        String informacion= "";
        for(Trabajador t : trabajadores){
            informacion += " "+t.listarInformacion();
        }
        
        return informacion;
    }
    
    /*public String reporteNomina(){
        return "s";
    }*/

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }
    
    
    
}
